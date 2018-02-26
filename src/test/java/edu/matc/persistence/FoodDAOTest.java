package edu.matc.persistence;

import edu.matc.entity.Food;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Food dao test.
 */
public class FoodDAOTest {

    /**
     * The Dao.
     */

    GenericDAO genericDAO;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        genericDAO = new GenericDAO(Food.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }


    /**
     * Gets all foods success.
     */
    @Test
    void getAllFoodsSuccess() {
        List<Food> foodList = genericDAO.getAll();
        assertEquals(2, foodList.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        Food retrievedFood = (Food)genericDAO.getById(1);
        assertNotNull(retrievedFood);
        assertEquals("strawberry", retrievedFood.getFoodName());
    }

    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {
        //UserDAO userDAO = new UserDAO();
        GenericDAO userDAO = new GenericDAO(User.class);
        User user = (User)userDAO.getById(1);
        String foodName = "Jalapeno";
        Food newFood = new Food(foodName,29, user);
        user.addFood(newFood);


        int id = genericDAO.insert(newFood);

        assertNotEquals(0,id);
        Food insertedFood= (Food)genericDAO.getById(id);
        assertNotNull(insertedFood.getUser());
        assertEquals("Jalapeno", insertedFood.getFoodName());
        assertNotNull(insertedFood.getUser());
        assertEquals("Alex", insertedFood.getUser().getFirstName());


    }

    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {
        genericDAO.delete(genericDAO.getById(2));
        assertNull(genericDAO.getById(2));
    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String foodName = "Kiwi";
        Food foodToUpdate = (Food)genericDAO.getById(2);
        foodToUpdate.setFoodName(foodName);
        genericDAO.saveOrUpdate(foodToUpdate);
        Food retrievedFood = (Food)genericDAO.getById(2);
        assertEquals(foodToUpdate, retrievedFood);
    }

    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Food> foodList = genericDAO.getByPropertyEqual("foodName", "strawberry");
        assertEquals(1, foodList.size());
        assertEquals(1,foodList.get(0).getId());
    }

    /**
     * Gets by property success.
     */
    @Test
    void getByPropertySuccess() {
        List<Food> foodList = genericDAO.getByPropertyLike("foodName", "b");
        assertEquals(1, foodList.size());
    }


}
