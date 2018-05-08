package edu.matc.entity;


import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmTimestampAttributeType;
import util.LocalDateAttributeConverter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * The type Calorie.
 */
@Entity(name = "Calorie")
@Table(name = "Calories")
public class Calorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate date;

    private int calorie_value;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new Calorie.
     */
    public Calorie() {
    }

    public Calorie(LocalDate date, int calorie_value, User user) {
        this.date = date;
        this.calorie_value = calorie_value;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Calorie{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                '}';
    }

    public int getCalorie_value() {
        return calorie_value;
    }

    public void setCalorie_value(int calorie_value) {
        this.calorie_value = calorie_value;
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
     * Gets date.
     *
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(LocalDate date) {
        this.date = date;
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
}