package edu.matc.entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe.
 */
@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;


    @ManyToOne
    private User user;


    private String recipeName;

    /**
     * Instantiates a new Recipe.
     *
     * @param id         the id
     * @param user       the user
     * @param recipeName the recipe name
     */
    public Recipe(int id, User user, String recipeName) {
        this.id = id;
        this.user = user;
        this.recipeName = recipeName;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Instantiates a new Recipe.
     */
    public Recipe() {
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
     * Gets recipe name.
     *
     * @return the recipe name
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * Sets recipe name.
     *
     * @param recipeName the recipe name
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", user=" + user +
                ", recipeName='" + recipeName + '\'' +
                '}';
    }

}
