package com.vstl.methodoverriding;

public class TestMethodOverriding {

	public static void main(String[] args) {
		
		Student objStudent = new Student();
		objStudent.getStudentName();
		objStudent.getInfo("", "");
		StudentDetail objStudentDetail =new StudentDetail();
		 objStudentDetail.getInfo("Ronu", "6783");

	}

}