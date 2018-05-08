package edu.matc.nutritionixapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Full nutrients item.
 */
@Generated("com.robohorse.robopojogenerator")
public class FullNutrientsItem{

	@JsonProperty("value")
	private double value;

	@JsonProperty("attr_id")
	private int attrId;

	/**
	 * Set value.
	 *
	 * @param value the value
	 */
	public void setValue(double value){
		this.value = value;
	}

	/**
	 * Get value double.
	 *
	 * @return the double
	 */
	public double getValue(){
		return value;
	}

	/**
	 * Set attr id.
	 *
	 * @param attrId the attr id
	 */
	public void setAttrId(int attrId){
		this.attrId = attrId;
	}

	/**
	 * Get attr id int.
	 *
	 * @return the int
	 */
	public int getAttrId(){
		return attrId;
	}

	@Override
 	public String toString(){
		return 
			"FullNutrientsItem{" + 
			"value = '" + value + '\'' + 
			",attr_id = '" + attrId + '\'' + 
			"}";
		}
}