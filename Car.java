package com.vstl.superExample;

public class Car {
	
	//The super keyword in Java is a reference variable which is used to refer immediate parent class object.


		public String strName="mahindra";
		public String strNo="6562";
		
		public String strCarRegNo="501";
	
	 public Car() {
		 System.out.println("Car Reg No "+strCarRegNo);
	 }
		 	
	public void getCarName(String strName) {
		System.out.println("Car Name is Mahindra");
	}
	
	
	public void getCarInfo(String strCarName ,String strCarNo) {
		strCarName=strName;
		System.out.println("Carname : "+strCarName);
		strCarNo=strNo;
		System.out.println("Carno  : "+strCarNo);
	}
	
	
}	