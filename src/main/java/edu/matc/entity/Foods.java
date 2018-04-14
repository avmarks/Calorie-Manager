package edu.matc.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "foods")
@XmlAccessorType (XmlAccessType.FIELD)
public class Foods
{
    @XmlElement(name = "food")
    private List<Food> foods = null;

    public List<Food> getFood() {
        return foods;
    }

    public void setFood(List<Food> foods) {
        this.foods = foods;
    }
}