package edu.matc.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Objects;

/**
 * This class represents food
 */
@Entity(name = "Food")
@Table(name = "food")
@XmlAccessorType( XmlAccessType.FIELD)
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    /**
     * The Id.
     */
    public int id;

    @JsonIgnore
    @XmlTransient
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
    public double foodCalories;

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
    public double getFoodCalories() {
        return foodCalories;
    }

    /**
     * Sets food calories.
     *
     * @param foodCalories the food calories
     */
    public void setFoodCalories(double foodCalories) {
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
    public Food( String foodName, double foodCalories, User user) {
        this.user = user;
        this.foodName = foodName;
        this.foodCalories = foodCalories;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return id == food.id &&
                foodCalories == food.foodCalories &&
                Objects.equals(user, food.user) &&
                Objects.equals(foodName, food.foodName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, user, foodName, foodCalories);
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
