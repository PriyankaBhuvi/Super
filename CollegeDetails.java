package com.vstl.finalExample;

public class CollegeDetails extends College{
	
	
	 String strCollegeName ="Shivanand Collge";

 public void printCollegeName(String strName) {
	 strName=super.strCollegeName;
		System.out.println("College Name is  : " +strCollegeName);
	}	
	
  public void printTotalMarksInfo(int intStudentTotalMarks) {
	  int intTheoryMarks =40;
		int intPracticalmarks=30;
	int  intTotalMarks =intTheoryMarks+intPracticalmarks;
			System.out.println("College Name is : "+intTotalMarks);
	
}	

}
