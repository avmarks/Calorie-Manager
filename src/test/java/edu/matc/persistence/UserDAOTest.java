package edu.matc.persistence;

import edu.matc.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class tests the success of UserDao methods.
 */
class UserDAOTest {
    /**
     * Instantiating the DAO.
     */
    UserDAO dao;

    /**
     * The set up.
     */
    @BeforeEach
    void setUp() {

        dao = new UserDAO();
    }

    /**
     * Verifies the getAllUsers is a success.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(1, users.size());
    }

    /**
     * Verifies the getUsersByLastName is a success.
     */
    @Test
    void getUsersByLastNameSuccess() {
        List<User> users = dao.getUsersByLastName("A");
        assertEquals(1, users.size());
    }

    /**
     * Verifies that a user is returned by entering an id
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        assertEquals("Alex", retrievedUser.getFirstName());
    }




    /**
     * Verify successful insert of a user
     *
    @Test
    void insertSuccess() {

        User newUser = new User("1", "Flintstone", "Fred", "helloFred", "password");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertEquals("Fred", insertedUser.getFirstName());
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // TODO review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }

    /**
     * Verify successful insert of a user
     *
    @Test
    void insertWithOrderSuccess() {

        User newUser = new User("Fred", "Flintstone", "fflintstone", LocalDate.parse("1168-01-01"));

        String orderDescription = "Order 1";
        Order order = new Order(orderDescription, newUser);

        newUser.addOrder(order);

        int id = dao.insert(newUser);

        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertEquals("Fred", insertedUser.getFirstName());
        assertEquals(1, insertedUser.getOrders().size());
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // TODO review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }
**/
    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }

    /**
     * Verify successful update of user
     */
    @Test
    void updateSuccess() {
        String newLastName = "Davis";
        User userToUpdate = dao.getById(3);
        userToUpdate.setLastName(newLastName);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(3);
        assertEquals(newLastName, retrievedUser.getLastName());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyEqual("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }
}