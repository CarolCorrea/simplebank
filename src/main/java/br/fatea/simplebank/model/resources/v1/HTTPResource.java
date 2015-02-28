package br.fatea.simplebank.model.resources.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name="resource") 
@JsonTypeName("resource") 
@JsonInclude(Include.NON_NULL)
public class HTTPResource extends ResourceSupport {
	
	@XmlElement(required=false, name="error_message") 
	@JsonProperty(required=false, value="error_message") 
	private String errorMessage; 
	
	public String getErrorMessage() { 
		return errorMessage; 
	} 
	
	public void setErrorMessage(String errorMessage) { 
		this.errorMessage = errorMessage; 
	}
}
