//package edu.matc.persistence;
//
//import edu.matc.entity.User;
//import edu.matc.test.util.Database;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * This class tests the success of User methods.
// */
//class UserDAOTest {
//    /**
//     * The Generic dao.
//     */
//    GenericDAO genericDAO;
//
//    /**
//     * The set up.
//     */
//    @BeforeEach
//    void setUp() {
//        genericDAO = new GenericDAO(User.class);
//
//        Database database = Database.getInstance();
//        database.runSQL("cleandb.sql");
//    }
//
//    /**
//     * Verifies the getAllUsers is a success.
//     */
//    @Test
//    void getAllUsersSuccess() {
//        List<User> users = genericDAO.getAll();
//        assertEquals(4, users.size());
//    }
//
//
//    /**
//     * Verifies that a user is returned by entering an id
//     */
//    @Test
//    void getByIdSuccess() {
//        User retrievedUser = (User)genericDAO.getById(1);
//        assertEquals("Alex", retrievedUser.getFirstName());
//    }
//
//
//    /**
//     * Insert success.
//
//    @Test
//    void insertSuccess() {
//
//        User newUser = new User("Fred", "Flintstone", "fflintstone", "chocolate");
//        int id = genericDAO.insert(newUser);
//        assertNotEquals(0, id);
//        User insertedUser = (User)genericDAO.getById(id);
//        assertNotNull(insertedUser);
//        assertEquals("Fred", insertedUser.getFirstName());
//
//
//    }
//
//
//    /**
//     * Delete success.
//
//    @Test
//    void deleteSuccess() {
//        genericDAO.delete(genericDAO.getById(1));
//        assertNull(genericDAO.getById(1));
//    }
//
//
//    /**
//     * Update success.
//     */
//    @Test
//    void updateSuccess() {
//        String newLastName = "Marks";
//        User userToUpdate = (User)genericDAO.getById(1);
//        userToUpdate.setLastName(newLastName);
//        genericDAO.saveOrUpdate(userToUpdate);
//        User retrievedUser = (User)genericDAO.getById(1);
//        assertEquals(userToUpdate, retrievedUser);
//    }
//
//
//    /**
//     * Gets by property equal success.
//     */
//    @Test
//    void getByPropertyEqualSuccess() {
//        List<User> users = genericDAO.getByPropertyEqual("firstName", "Alex");
//        assertEquals(1, users.size());
//        assertEquals(1, users.get(0).getId());
//    }
//
//    /**
//     * Verify successful get by property (like match)
//     */
//    @Test
//    void getByPropertyLikeSuccess() {
//        List<User> users = genericDAO.getByPropertyLike("firstName", "Alex");
//        assertEquals(1, users.size());
//    }
//}