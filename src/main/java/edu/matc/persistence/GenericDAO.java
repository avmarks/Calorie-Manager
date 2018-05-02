package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * A generic DAO is inspired by the http://rodrigouchoa.wordpress.com
 * and Paula Waite
 */
public class GenericDAO<T> {
    private Class<T> type;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiates a new Generic dao.
     *
     * @param type the entity type, for example, User.
     */
    public GenericDAO(Class<T> type) {
        this.type = type;
    }

    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    /**
     * Gets an entity by id
     * @param id entity id to search by
     * @return entity
     */
    public <T> T getById(int id) {
        Session session = getSession();
        T entity = (T)session.get(type, id);
        session.close();
        return entity;
    }

    /**
     * Deletes the entity.
     *
     * @param entity entity to be deleted
     */
    public void delete(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Gets all entities
     *
     * @return the all entities
     */
    public List<T> getAll() {
        Session session = getSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        List<T> list = session.createQuery(query).getResultList();
        session.close();
        return list;

    }
    /**
     * Gets user id.
     *
     * @param value the value
     * @return the user id
     */
    public List<T> getUserID(String value) {

        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPath = root.get("userName");
        query.where(builder.like(propertyPath, "%" + value + "%"));
        List<T> userID = session.createQuery(query).getResultList();
        session.close();
        return userID;
    }


    /**
     * update user
     * @param entity  User to be inserted or updated
     * @return id of the inserted user
     */
    public int insert(T entity) {
        int id = 0;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(entity);
        transaction.commit();
        session.close();
        return id;
    }

    public void saveOrUpdate(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }


    /**
     * Get user by property (exact match)
     * sample usage: getByPropertyEqual("lastName", "Curry")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of users meeting the criteria search
     */
    public List<T> getByPropertyEqual(String propertyName, String value) {
        Session session = getSession();

        logger.debug("Searching for user with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from( type );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<T> users = session.createQuery( query ).getResultList();

        session.close();
        return users;
    }

    /**
     * Get user by property (like)
     * sample usage: getByPropertyLike("lastName", "C")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of users meeting the criteria search
     */
    public List<T> getByPropertyLike(String propertyName, String value) {
        Session session = getSession();

        logger.debug("Searching for user with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type);
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<T> users = session.createQuery( query ).getResultList();
        session.close();
        return users;
    }







  /*  public List<User> getByWhereAndLike(String propertyName, String value, int userId, String idValue) {

        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery( User.class );
        Root<User> root = query.from( User.class );
        root.fetch( "foodSet", JoinType.LEFT);
        query.select(root).where(
                builder.and(
                        builder.equal(root.get(propertyName), value),
                        builder.equal(root.get(String.valueOf(userId)), idValue)
                )
        );
        List<User> users = session.createQuery( query ).getResultList();

        return users;
    }*/

}
