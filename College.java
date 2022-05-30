package com.vstl.finalExample;

public class College {
	//The final keyword in java is used to restrict the user.
    //Final Class can't be extend in java.

	 String strCollegeName ="Shivanand Collge";
	
	
	public void printCollegeName(String strName) {
		
		final String strCollegeName=strName;
		
		System.out.println("College Name is  : " +strCollegeName);
	}
	
	public final void printTotalMarksInfo(int intTheorymarks,int intpracticalmarks) {
		int intTheoryMarks =40;
		int intPracticalmarks=30;
	int  intTotalMarks =intTheorymarks+intpracticalmarks;
			System.out.println("College Name is : "+intTotalMarks);
			
			
		}
	
}	
	
	
	
	
	
	
	

