package edu.matc.nutritionixapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Foods.
 */
@Generated("com.robohorse.robopojogenerator")
public class Foods{

	@JsonProperty("foods")
	private List<FoodsItem> foods;

	/**
	 * Set foods.
	 *
	 * @param foods the foods
	 */
	public void setFoods(List<FoodsItem> foods){
		this.foods = foods;
	}

	/**
	 * Get foods list.
	 *
	 * @return the list
	 */
	public List<FoodsItem> getFoods(){
		return foods;
	}

	@Override
 	public String toString(){
		return 
			"Foods{" + 
			"foods = '" + foods + '\'' + 
			"}";
		}
}