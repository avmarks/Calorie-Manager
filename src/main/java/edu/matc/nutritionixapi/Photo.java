package edu.matc.nutritionixapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Photo.
 */
@Generated("com.robohorse.robopojogenerator")
public class Photo{

	@JsonProperty("is_user_uploaded")
	private boolean isUserUploaded;

	@JsonProperty("thumb")
	private String thumb;

	@JsonProperty("highres")
	private Object highres;

	/**
	 * Set is user uploaded.
	 *
	 * @param isUserUploaded the is user uploaded
	 */
	public void setIsUserUploaded(boolean isUserUploaded){
		this.isUserUploaded = isUserUploaded;
	}

	/**
	 * Is is user uploaded boolean.
	 *
	 * @return the boolean
	 */
	public boolean isIsUserUploaded(){
		return isUserUploaded;
	}

	/**
	 * Set thumb.
	 *
	 * @param thumb the thumb
	 */
	public void setThumb(String thumb){
		this.thumb = thumb;
	}

	/**
	 * Get thumb string.
	 *
	 * @return the string
	 */
	public String getThumb(){
		return thumb;
	}

	/**
	 * Set highres.
	 *
	 * @param highres the highres
	 */
	public void setHighres(Object highres){
		this.highres = highres;
	}

	/**
	 * Get highres object.
	 *
	 * @return the object
	 */
	public Object getHighres(){
		return highres;
	}

	@Override
 	public String toString(){
		return 
			"Photo{" + 
			"is_user_uploaded = '" + isUserUploaded + '\'' + 
			",thumb = '" + thumb + '\'' + 
			",highres = '" + highres + '\'' + 
			"}";
		}
}