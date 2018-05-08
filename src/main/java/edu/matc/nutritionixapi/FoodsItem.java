package edu.matc.nutritionixapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Foods item.
 */
@Generated("com.robohorse.robopojogenerator")
public class FoodsItem{

	@JsonProperty("food_name")
	private String foodName;


	@JsonProperty("nf_saturated_fat")
	private double nfSaturatedFat;

	@JsonProperty("metadata")
	private Metadata metadata;

	@JsonProperty("nf_cholesterol")
	private int nfCholesterol;

	@JsonProperty("sub_recipe")
	private Object subRecipe;

	@JsonProperty("nix_brand_id")
	private Object nixBrandId;

	@JsonProperty("nf_potassium")
	private int nfPotassium;

	@JsonProperty("meal_type")
	private int mealType;

	@JsonProperty("nf_total_fat")
	private double nfTotalFat;

	@JsonProperty("nf_sugars")
	private double nfSugars;

	@JsonProperty("nf_protein")
	private double nfProtein;

	@JsonProperty("source")
	private Object source;

	@JsonProperty("nix_item_id")
	private Object nixItemId;

	@JsonProperty("ndb_no")
	private Object ndbNo;

	@JsonProperty("serving_unit")
	private String servingUnit;

	@JsonProperty("alt_measures")
	private Object altMeasures;

	@JsonProperty("nf_p")
	private int nfP;

	@JsonProperty("lat")
	private Object lat;

	@JsonProperty("lng")
	private Object lng;

	@JsonProperty("consumed_at")
	private String consumedAt;

	@JsonProperty("nix_item_name")
	private Object nixItemName;

	@JsonProperty("upc")
	private Object upc;

	@JsonProperty("photo")
	private Photo photo;

	@JsonProperty("brand_name")
	private Object brandName;

	@JsonProperty("serving_weight_grams")
	private int servingWeightGrams;

	@JsonProperty("nf_total_carbohydrate")
	private double nfTotalCarbohydrate;

	@JsonProperty("full_nutrients")
	private List<FullNutrientsItem> fullNutrients;

	@JsonProperty("tags")
	private Object tags;

	@JsonProperty("nix_brand_name")
	private Object nixBrandName;

	@JsonProperty("serving_qty")
	private int servingQty;

	@JsonProperty("nf_calories")
	private int nfCalories;

	@JsonProperty("nf_sodium")
	private int nfSodium;

	@JsonProperty("nf_dietary_fiber")
	private int nfDietaryFiber;

	/**
	 * Set food name.
	 *
	 * @param foodName the food name
	 */
	public void setFoodName(String foodName){
		this.foodName = foodName;
	}

	/**
	 * Get food name string.
	 *
	 * @return the string
	 */
	public String getFoodName(){
		return foodName;
	}

	/**
	 * Set nf saturated fat.
	 *
	 * @param nfSaturatedFat the nf saturated fat
	 */
	public void setNfSaturatedFat(double nfSaturatedFat){
		this.nfSaturatedFat = nfSaturatedFat;
	}

	/**
	 * Get nf saturated fat double.
	 *
	 * @return the double
	 */
	public double getNfSaturatedFat(){
		return nfSaturatedFat;
	}

	/**
	 * Set metadata.
	 *
	 * @param metadata the metadata
	 */
	public void setMetadata(Metadata metadata){
		this.metadata = metadata;
	}

	/**
	 * Get metadata metadata.
	 *
	 * @return the metadata
	 */
	public Metadata getMetadata(){
		return metadata;
	}

	/**
	 * Set nf cholesterol.
	 *
	 * @param nfCholesterol the nf cholesterol
	 */
	public void setNfCholesterol(int nfCholesterol){
		this.nfCholesterol = nfCholesterol;
	}

	/**
	 * Get nf cholesterol int.
	 *
	 * @return the int
	 */
	public int getNfCholesterol(){
		return nfCholesterol;
	}

	/**
	 * Set sub recipe.
	 *
	 * @param subRecipe the sub recipe
	 */
	public void setSubRecipe(Object subRecipe){
		this.subRecipe = subRecipe;
	}

	/**
	 * Get sub recipe object.
	 *
	 * @return the object
	 */
	public Object getSubRecipe(){
		return subRecipe;
	}

	/**
	 * Set nix brand id.
	 *
	 * @param nixBrandId the nix brand id
	 */
	public void setNixBrandId(Object nixBrandId){
		this.nixBrandId = nixBrandId;
	}

	/**
	 * Get nix brand id object.
	 *
	 * @return the object
	 */
	public Object getNixBrandId(){
		return nixBrandId;
	}

	/**
	 * Set nf potassium.
	 *
	 * @param nfPotassium the nf potassium
	 */
	public void setNfPotassium(int nfPotassium){
		this.nfPotassium = nfPotassium;
	}

	/**
	 * Get nf potassium int.
	 *
	 * @return the int
	 */
	public int getNfPotassium(){
		return nfPotassium;
	}

	/**
	 * Set meal type.
	 *
	 * @param mealType the meal type
	 */
	public void setMealType(int mealType){
		this.mealType = mealType;
	}

	/**
	 * Get meal type int.
	 *
	 * @return the int
	 */
	public int getMealType(){
		return mealType;
	}

	/**
	 * Set nf total fat.
	 *
	 * @param nfTotalFat the nf total fat
	 */
	public void setNfTotalFat(double nfTotalFat){
		this.nfTotalFat = nfTotalFat;
	}

	/**
	 * Get nf total fat double.
	 *
	 * @return the double
	 */
	public double getNfTotalFat(){
		return nfTotalFat;
	}

	/**
	 * Set nf sugars.
	 *
	 * @param nfSugars the nf sugars
	 */
	public void setNfSugars(double nfSugars){
		this.nfSugars = nfSugars;
	}

	/**
	 * Get nf sugars double.
	 *
	 * @return the double
	 */
	public double getNfSugars(){
		return nfSugars;
	}

	/**
	 * Set nf protein.
	 *
	 * @param nfProtein the nf protein
	 */
	public void setNfProtein(double nfProtein){
		this.nfProtein = nfProtein;
	}

	/**
	 * Get nf protein double.
	 *
	 * @return the double
	 */
	public double getNfProtein(){
		return nfProtein;
	}

	/**
	 * Set source.
	 *
	 * @param source the source
	 */
	public void setSource(Object source){
		this.source = source;
	}

	/**
	 * Get source object.
	 *
	 * @return the object
	 */
	public Object getSource(){
		return source;
	}

	/**
	 * Set nix item id.
	 *
	 * @param nixItemId the nix item id
	 */
	public void setNixItemId(Object nixItemId){
		this.nixItemId = nixItemId;
	}

	/**
	 * Get nix item id object.
	 *
	 * @return the object
	 */
	public Object getNixItemId(){
		return nixItemId;
	}

	/**
	 * Set ndb no.
	 *
	 * @param ndbNo the ndb no
	 */
	public void setNdbNo(Object ndbNo){
		this.ndbNo = ndbNo;
	}

	/**
	 * Get ndb no object.
	 *
	 * @return the object
	 */
	public Object getNdbNo(){
		return ndbNo;
	}

	/**
	 * Set serving unit.
	 *
	 * @param servingUnit the serving unit
	 */
	public void setServingUnit(String servingUnit){
		this.servingUnit = servingUnit;
	}

	/**
	 * Get serving unit string.
	 *
	 * @return the string
	 */
	public String getServingUnit(){
		return servingUnit;
	}

	/**
	 * Set alt measures.
	 *
	 * @param altMeasures the alt measures
	 */
	public void setAltMeasures(Object altMeasures){
		this.altMeasures = altMeasures;
	}

	/**
	 * Get alt measures object.
	 *
	 * @return the object
	 */
	public Object getAltMeasures(){
		return altMeasures;
	}

	/**
	 * Set nf p.
	 *
	 * @param nfP the nf p
	 */
	public void setNfP(int nfP){
		this.nfP = nfP;
	}

	/**
	 * Get nf p int.
	 *
	 * @return the int
	 */
	public int getNfP(){
		return nfP;
	}

	/**
	 * Set lat.
	 *
	 * @param lat the lat
	 */
	public void setLat(Object lat){
		this.lat = lat;
	}

	/**
	 * Get lat object.
	 *
	 * @return the object
	 */
	public Object getLat(){
		return lat;
	}

	/**
	 * Set lng.
	 *
	 * @param lng the lng
	 */
	public void setLng(Object lng){
		this.lng = lng;
	}

	/**
	 * Get lng object.
	 *
	 * @return the object
	 */
	public Object getLng(){
		return lng;
	}

	/**
	 * Set consumed at.
	 *
	 * @param consumedAt the consumed at
	 */
	public void setConsumedAt(String consumedAt){
		this.consumedAt = consumedAt;
	}

	/**
	 * Get consumed at string.
	 *
	 * @return the string
	 */
	public String getConsumedAt(){
		return consumedAt;
	}

	/**
	 * Set nix item name.
	 *
	 * @param nixItemName the nix item name
	 */
	public void setNixItemName(Object nixItemName){
		this.nixItemName = nixItemName;
	}

	/**
	 * Get nix item name object.
	 *
	 * @return the object
	 */
	public Object getNixItemName(){
		return nixItemName;
	}

	/**
	 * Set upc.
	 *
	 * @param upc the upc
	 */
	public void setUpc(Object upc){
		this.upc = upc;
	}

	/**
	 * Get upc object.
	 *
	 * @return the object
	 */
	public Object getUpc(){
		return upc;
	}

	/**
	 * Set photo.
	 *
	 * @param photo the photo
	 */
	public void setPhoto(Photo photo){
		this.photo = photo;
	}

	/**
	 * Get photo photo.
	 *
	 * @return the photo
	 */
	public Photo getPhoto(){
		return photo;
	}

	/**
	 * Set brand name.
	 *
	 * @param brandName the brand name
	 */
	public void setBrandName(Object brandName){
		this.brandName = brandName;
	}

	/**
	 * Get brand name object.
	 *
	 * @return the object
	 */
	public Object getBrandName(){
		return brandName;
	}

	/**
	 * Set serving weight grams.
	 *
	 * @param servingWeightGrams the serving weight grams
	 */
	public void setServingWeightGrams(int servingWeightGrams){
		this.servingWeightGrams = servingWeightGrams;
	}

	/**
	 * Get serving weight grams int.
	 *
	 * @return the int
	 */
	public int getServingWeightGrams(){
		return servingWeightGrams;
	}

	/**
	 * Set nf total carbohydrate.
	 *
	 * @param nfTotalCarbohydrate the nf total carbohydrate
	 */
	public void setNfTotalCarbohydrate(double nfTotalCarbohydrate){
		this.nfTotalCarbohydrate = nfTotalCarbohydrate;
	}

	/**
	 * Get nf total carbohydrate double.
	 *
	 * @return the double
	 */
	public double getNfTotalCarbohydrate(){
		return nfTotalCarbohydrate;
	}

	/**
	 * Set full nutrients.
	 *
	 * @param fullNutrients the full nutrients
	 */
	public void setFullNutrients(List<FullNutrientsItem> fullNutrients){
		this.fullNutrients = fullNutrients;
	}

	/**
	 * Get full nutrients list.
	 *
	 * @return the list
	 */
	public List<FullNutrientsItem> getFullNutrients(){
		return fullNutrients;
	}

	/**
	 * Set tags.
	 *
	 * @param tags the tags
	 */
	public void setTags(Object tags){
		this.tags = tags;
	}

	/**
	 * Get tags object.
	 *
	 * @return the object
	 */
	public Object getTags(){
		return tags;
	}

	/**
	 * Set nix brand name.
	 *
	 * @param nixBrandName the nix brand name
	 */
	public void setNixBrandName(Object nixBrandName){
		this.nixBrandName = nixBrandName;
	}

	/**
	 * Get nix brand name object.
	 *
	 * @return the object
	 */
	public Object getNixBrandName(){
		return nixBrandName;
	}

	/**
	 * Set serving qty.
	 *
	 * @param servingQty the serving qty
	 */
	public void setServingQty(int servingQty){
		this.servingQty = servingQty;
	}

	/**
	 * Get serving qty int.
	 *
	 * @return the int
	 */
	public int getServingQty(){
		return servingQty;
	}

	/**
	 * Set nf calories.
	 *
	 * @param nfCalories the nf calories
	 */
	public void setNfCalories(int nfCalories){
		this.nfCalories = nfCalories;
	}

	/**
	 * Get nf calories int.
	 *
	 * @return the int
	 */
	public int getNfCalories(){
		return nfCalories;
	}

	/**
	 * Set nf sodium.
	 *
	 * @param nfSodium the nf sodium
	 */
	public void setNfSodium(int nfSodium){
		this.nfSodium = nfSodium;
	}

	/**
	 * Get nf sodium int.
	 *
	 * @return the int
	 */
	public int getNfSodium(){
		return nfSodium;
	}

	/**
	 * Set nf dietary fiber.
	 *
	 * @param nfDietaryFiber the nf dietary fiber
	 */
	public void setNfDietaryFiber(int nfDietaryFiber){
		this.nfDietaryFiber = nfDietaryFiber;
	}

	/**
	 * Get nf dietary fiber int.
	 *
	 * @return the int
	 */
	public int getNfDietaryFiber(){
		return nfDietaryFiber;
	}

	@Override
 	public String toString(){
		return 
			"FoodsItem{" + 
			"food_name = '" + foodName + '\'' + 
			",nf_saturated_fat = '" + nfSaturatedFat + '\'' + 
			",metadata = '" + metadata + '\'' + 
			",nf_cholesterol = '" + nfCholesterol + '\'' + 
			",sub_recipe = '" + subRecipe + '\'' + 
			",nix_brand_id = '" + nixBrandId + '\'' + 
			",nf_potassium = '" + nfPotassium + '\'' + 
			",meal_type = '" + mealType + '\'' + 
			",nf_total_fat = '" + nfTotalFat + '\'' + 
			",nf_sugars = '" + nfSugars + '\'' + 
			",nf_protein = '" + nfProtein + '\'' + 
			",source = '" + source + '\'' + 
			",nix_item_id = '" + nixItemId + '\'' + 
			",ndb_no = '" + ndbNo + '\'' + 
			",serving_unit = '" + servingUnit + '\'' + 
			",alt_measures = '" + altMeasures + '\'' + 
			",nf_p = '" + nfP + '\'' + 
			",lat = '" + lat + '\'' + 
			",lng = '" + lng + '\'' + 
			",consumed_at = '" + consumedAt + '\'' + 
			",nix_item_name = '" + nixItemName + '\'' + 
			",upc = '" + upc + '\'' + 
			",photo = '" + photo + '\'' + 
			",brand_name = '" + brandName + '\'' + 
			",serving_weight_grams = '" + servingWeightGrams + '\'' + 
			",nf_total_carbohydrate = '" + nfTotalCarbohydrate + '\'' + 
			",full_nutrients = '" + fullNutrients + '\'' + 
			",tags = '" + tags + '\'' + 
			",nix_brand_name = '" + nixBrandName + '\'' + 
			",serving_qty = '" + servingQty + '\'' + 
			",nf_calories = '" + nfCalories + '\'' + 
			",nf_sodium = '" + nfSodium + '\'' + 
			",nf_dietary_fiber = '" + nfDietaryFiber + '\'' + 
			"}";
		}
}