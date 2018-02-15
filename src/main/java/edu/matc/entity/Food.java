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
    public int foodId;


    @Column(name = "food_name")
    public String foodName;
    @Column(name = "food_calories")
    public String foodCalories;

}
