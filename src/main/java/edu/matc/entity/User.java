package edu.matc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The type User.
 */
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonIgnore
    @XmlTransient
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Food> foodSet = new HashSet<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Role> userRoles = new ArrayList<>();

   // @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  //  private Set<Recipe> recipes = new HashSet<>();


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {

        this.userName = userName;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
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
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets food set.
     *
     * @return the food set
     */
    public Set<Food> getFoodSet() {


        return foodSet;
    }

    /**
     * Sets food set.
     *
     * @param foodSet the food set
     */
    public void setFoodSet(Set<Food> foodSet) {
        this.foodSet = foodSet;
    }

    /**
     * Add food.
     *
     * @param food the food
     */
    public void addFood(Food food) {
        foodSet.add(food);
        food.setUser(this);
    }



    /**
     * Instantiates a new User.
     */
    public User() {
    }


    /**
     * Add role.
     *
     * @param role the role
     */
    public void addRole(Role role) {
        userRoles.add(role);

    }

    /**
     * Instantiates a new User.
     *
     * @param password  the password
     * @param firstName the first name
     * @param lastName  the last name
     * @param userName  the user name
     */
    public User(String password, String firstName, String lastName, String userName) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        //this.foodSet = foodSet;
        //this.recipes = recipes;
    }


    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, userName, id);
    }


    /**
     * Gets user roles.
     *
     * @return the user roles
     */
    public List<Role> getUserRoles() {
        return userRoles;
    }

    /**
     * Sets user roles.
     *
     * @param userRoles the user roles
     */
    public void setUserRoles(List<Role> userRoles) {
        this.userRoles = userRoles;
    }

    /**
     * Gets recipes.
     *
     * @return the recipes
     */
   // public Set<Recipe> getRecipes() {
    //    return recipes;
   // }

    /**
     * Sets recipes.
     *
     * @param recipes the recipes
     */
  //  public void setRecipes(Set<Recipe> recipes) {
    //    this.recipes = recipes;
  //  }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }


}
