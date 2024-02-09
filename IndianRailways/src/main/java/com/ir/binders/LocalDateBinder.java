package com.ir.binders;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;

public class LocalDateBinder extends PropertyEditorSupport
{

	/* 	@Override
	public void setAsText(String text) throws IllegalArgumentException {
	   String[] split = text.split("-");
	   int year=Integer.parseInt(split[0]);
	   int mon=Integer.parseInt(split[1]);
	   int day=Integer.parseInt(split[2]);
	   LocalDate localdate=	LocalDate.of(year, mon, day);
    setValue(localdate);
	   
	}
*/
	public void setAsText(String text) throws IllegalArgumentException {
		String[]split=text.split("-");
		int year=Integer.parseInt(split[0]);
		int mon=Integer.parseInt(split[1]);
		int day=Integer.parseInt(split[2]);
		LocalDate localdate=LocalDate.of(year, mon, day);
		setValue(localdate);
	}
}
