package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Ingredient.
 */
@Entity(name = "Ingredient")
@Table(name = "ingredient")
public class Ingredient {

    @ManyToOne(optional = false)
    private Recipe recipes;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "ingredient_weight")
    private int ingredient_weight;

    @Column(name = "food_id")
    private int foodId;

    @Column(name = "recipe_id")
    private int recipeId;


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
     * Gets ingredient weight.
     *
     * @return the ingredient weight
     */
    public int getIngredient_weight() {
        return ingredient_weight;
    }

    /**
     * Sets ingredient weight.
     *
     * @param ingredient_weight the ingredient weight
     */
    public void setIngredient_weight(int ingredient_weight) {
        this.ingredient_weight = ingredient_weight;
    }



    /**
     * Gets food id.
     *
     * @return the food id
     */
    public int getFoodId() {
        return foodId;
    }

    /**
     * Sets food id.
     *
     * @param foodId the food id
     */
    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    /**
     * Gets recipe id.
     *
     * @return the recipe id
     */
    public int getRecipeId() {
        return recipeId;
    }

    /**
     * Instantiates a new Ingredient.
     */
    public Ingredient() {
    }

    /**
     * Sets recipe id.
     *
     * @param recipeId the recipe id
     */
    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }


    /**
     * Instantiates a new Ingredient.
     *
     * @param ingredient_weight the ingredient weight
     * @param foodId            the food id
     * @param recipeId          the recipe id
     */
    public Ingredient(int ingredient_weight, int foodId, int recipeId) {
        this.ingredient_weight = ingredient_weight;
        this.foodId = foodId;
        this.recipeId = recipeId;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", ingredient_weight=" + ingredient_weight +
                ", foodId=" + foodId +
                ", recipeId=" + recipeId +
                '}';
    }



    public Recipe getRecipes() {
        return recipes;
    }

    public void setRecipes(Recipe recipes) {
        this.recipes = recipes;
    }
}
