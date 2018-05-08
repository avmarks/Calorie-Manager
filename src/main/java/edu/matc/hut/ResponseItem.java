package edu.matc.hut;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ResponseItem{

	@JsonProperty("CalorieCountId")
	private int calorieCountId;

	@JsonProperty("PersonId")
	private int personId;

	@JsonProperty("DatetimeEntered")
	private String datetimeEntered;

	@JsonProperty("Calories")
	private int calories;

	public void setCalorieCountId(int calorieCountId){
		this.calorieCountId = calorieCountId;
	}

	public int getCalorieCountId(){
		return calorieCountId;
	}

	public void setPersonId(int personId){
		this.personId = personId;
	}

	public int getPersonId(){
		return personId;
	}

	public void setDatetimeEntered(String datetimeEntered){
		this.datetimeEntered = datetimeEntered;
	}

	public String getDatetimeEntered(){
		return datetimeEntered;
	}

	public void setCalories(int calories){
		this.calories = calories;
	}

	public int getCalories(){
		return calories;
	}

	@Override
 	public String toString(){
		return 
			"ResponseItem{" + 
			"calorieCountId = '" + calorieCountId + '\'' + 
			",personId = '" + personId + '\'' + 
			",datetimeEntered = '" + datetimeEntered + '\'' + 
			",calories = '" + calories + '\'' + 
			"}";
		}
}