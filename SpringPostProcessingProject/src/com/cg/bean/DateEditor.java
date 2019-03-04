package com.cg.bean;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String xmlDate) throws IllegalArgumentException {
		//xmlDate will contains the date in string format
		// below logic will convert the date into localDate format
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dt = LocalDate.parse(xmlDate, formatter);
		setValue(dt); //this will set date to joinDate property
	}
	

}
