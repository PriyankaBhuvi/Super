package com.vstl.methodoverriding;

public class StudentDetail  {
	
	   public String strStudent="Riya";
	   public String strNo="20221271";
	   
	   public void getStudentName() {
		   System.out.println("Name is Karni");
	   }

	   
	   public void getInfo(String strName,String strRegNo) {
			strName=strStudent;
			System.out.println("Name : "+strName);
	        strRegNo=strNo;
	        System.out.println("RegNo : "+strNo);
	   }   
	  
	   
}


