package edu.matc.entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * This class represents food
 */
@Entity(name = "Food")
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    /**
     * The Id.
     */
    public int id;

    @ManyToOne
    private User user;


    /**
     * The Food name.
     */
    @Column(name = "food_name")
    public String foodName;

    /**
     * The Food calories.
     */
    @Column(name = "food_calories")
    public int foodCalories;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets food name.
     *
     * @return the food name
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Sets food name.
     *
     * @param foodName the food name
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * Gets food calories.
     *
     * @return the food calories
     */
    public int getFoodCalories() {
        return foodCalories;
    }

    /**
     * Sets food calories.
     *
     * @param foodCalories the food calories
     */
    public void setFoodCalories(int foodCalories) {
        this.foodCalories = foodCalories;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }






    /**
     * Instantiates a new Food.
     *
     * @param user         the user
     * @param foodName     the food name
     * @param foodCalories the food calories
     */
    public Food(User user, String foodName, int foodCalories) {
        this.user = user;
        this.foodName = foodName;
        this.foodCalories = foodCalories;
    }


    /**
     * Instantiates a new Food.
     */
    public Food() {
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodCalories='" + foodCalories + '\'' +
                ", user=" + user +
                '}';
    }

}
