package edu.matc.nutritionixapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Metadata.
 */
@Generated("com.robohorse.robopojogenerator")
public class Metadata{


	@JsonProperty("is_raw_food")
	private boolean foodName;

	@Override
 	public String toString(){
		return 
			"Metadata{" + 
			"}";
		}
}