package com.vstl.methodoverriding;

public class Student extends StudentDetail{
	
	
	public String strStudentname="Karniga";
	public String strRegNo="2022766";
	
	
	
	public void getStudentName()  {
		System.out.println("name is karniga");
		
	}

	public void getInfo(String strName,String strRegNo) {
		strName=strStudent;
		System.out.println("Name : "+strName);
        strRegNo=strNo;
        System.out.println("RegNo : "+strNo);
   }
	
	
	}
	

