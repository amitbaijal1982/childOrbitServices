package com.childOrbit.bean;

import java.io.Serializable;

public class FieldErrorDTO implements Serializable{
	 
    private String field;
 
    private String message;
 
    public FieldErrorDTO(String field, String message) {
        this.field = field;
        this.message = message;
    }

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
 
    //Getters are omitted.
    
}