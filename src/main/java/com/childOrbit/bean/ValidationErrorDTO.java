package com.childOrbit.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO implements  Serializable{
	 
    private List<FieldErrorDTO> fieldErrors = new ArrayList<FieldErrorDTO>();
 
    public ValidationErrorDTO() {
 
    }
    
    
 
    public List<FieldErrorDTO> getFieldErrors() {
		return fieldErrors;
	}



	public void setFieldErrors(List<FieldErrorDTO> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}



	public void addFieldError(String path, String message) {
        FieldErrorDTO error = new FieldErrorDTO(path, message);
        fieldErrors.add(error);
    }
 
    //Getter is omitted.
}
