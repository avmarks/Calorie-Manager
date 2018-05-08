package edu.matc.hut;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JsonProperty("response")
    @JsonFormat(shape= JsonFormat.Shape.ARRAY)
	private List<ResponseItem> response;
    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
	public void setResponse(List<ResponseItem> response){
		this.response = response;
	}
    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
	public List<ResponseItem> getResponse(){
		return response;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"response = '" + response + '\'' + 
			"}";
		}
}