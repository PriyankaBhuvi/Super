package com.vstl.superExample;

public class Bmw extends Car {
	
	
		
  public void getCarName() {
	System.out.println("Car Name is Mahindra");
  }
  
 public void getCarDetails() { 
	 super.getCarName("toyota");
 }
 
  public void getCarInfo(String strCarName ,String strCarNo) {
		strCarName=super.strName;
		System.out.println("Carname : "+strCarName);
		strCarNo=super.strNo;
		System.out.println("Carno  : "+strCarNo);
  }
  
  public void getfeatures()  {
	  super.getCarInfo("Airbag ","Music System");
  
  }
  
} 
  