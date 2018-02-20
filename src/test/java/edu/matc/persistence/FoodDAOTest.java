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
    FoodDAO dao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        dao = new FoodDAO();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }


    /**
     * Gets all foods success.
     */
    @Test
    void getAllFoodsSuccess() {
        List<Food> foodList = dao.getAllFoods();
        assertEquals(2, foodList.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        Food retrievedFood = dao.getById(1);
        assertNotNull(retrievedFood);
        assertEquals("strawberry", retrievedFood.getFoodName());
    }

    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {
        UserDAO userDAO = new UserDAO();
        User user = userDAO.getById(1);
        String foodName = "Jalopeno";
        Food newFood = new Food(foodName,29, user);
        user.addFood(newFood);


        int id = dao.insert(newFood);

        assertNotEquals(0,id);
        Food insertedFood= dao.getById(id);
        assertNotNull(insertedFood.getUser());
        assertEquals("Jalopeno", insertedFood.getFoodName());
        assertNotNull(insertedFood.getUser());
        assertEquals("Alex", insertedFood.getUser().getFirstName());


    }

    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(2));
        assertNull(dao.getById(2));
    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String foodName = "Kiwi";
        Food foodToUpdate = dao.getById(2);
        foodToUpdate.setFoodName(foodName);
        dao.saveOrUpdate(foodToUpdate);
        Food retrievedFood = dao.getById(2);
        assertEquals(foodName, retrievedFood.getFoodName());
    }

    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Food> foodList = dao.getByPropertyEqual("foodName", "strawberry");
        assertEquals(1, foodList.size());
        assertEquals(1,foodList.get(0).getId());
    }

    /**
     * Gets by property success.
     */
    @Test
    void getByPropertySuccess() {
        List<Food> foodList = dao.getByPropertyLike("foodName", "b");
        assertEquals(1, foodList.size());
    }


}
