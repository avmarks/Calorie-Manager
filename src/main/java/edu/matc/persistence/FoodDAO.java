package edu.matc.persistence;


import edu.matc.entity.Food;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class FoodDAO {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    public List<Food> getAllFoods() {

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Food> query = builder.createQuery(Food.class);
        Root<Food> root = query.from(Food.class);
        List<Food> foods = session.createQuery(query).getResultList();
        session.close();
        return foods;
    }

    public List<Food> getFoodsByLastName(String lastName) {

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Food> query = builder.createQuery(Food.class);
        Root<Food> root = query.from(Food.class);
        //beginning of the where
        Expression<String>propertyPath = root.get("lastName");

        query.where(builder.like(propertyPath, "%" + lastName + "%"));
        List<Food> foods = session.createQuery(query).getResultList();
        session.close();
        return foods;
    }

    /**
     * Gets food by id.
     * @return a food
     */
    public Food getById(int id) {

        Session session = sessionFactory.openSession();

        Food food = session.get(Food.class, id);

        session.close();
        return food;

    }


    /**
     * update food
     * @param food  Food to be inserted or updated
     */
    public void saveOrUpdate(Food food) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(food);
        transaction.commit();
        session.close();
    }

    /**
     * update food
     * @param food  Food to be inserted or updated
     * @return id of the inserted food
     */
    public int insert(Food food) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(food);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a food
     * @param food Food to be deleted
     */
    public void delete(Food food) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(food);
        transaction.commit();
        session.close();
    }


    /**
     * Get food by property (exact match)
     * sample usage: getByPropertyEqual("lastName", "Curry")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of foods meeting the criteria search
     */
    public List<Food> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for food with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Food> query = builder.createQuery( Food.class );
        Root<Food> root = query.from( Food.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Food> foods = session.createQuery( query ).getResultList();

        session.close();
        return foods;
    }

    /**
     * Get food by property (like)
     * sample usage: getByPropertyLike("lastName", "C")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of foods meeting the criteria search
     */
    public List<Food> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for food with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Food> query = builder.createQuery( Food.class );
        Root<Food> root = query.from( Food.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Food> foods = session.createQuery( query ).getResultList();
        session.close();
        return foods;
    }

}

