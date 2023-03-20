package com.week3.variables;

public class Calculation {
	
	public static void main (String [] args) {
		// if you find an exception run the Catch block
		try {
			
 		Calculation Cal= new Calculation();
 		int minNum = Cal.FindMinNum(555, 865);
 		//minNum = Cal.FindMinNum(44, 44);
 		System.out.println("Minimum num is "+ minNum);
 		
 		Cal.printonetohundred();
 		Cal.printonetohundred1();
 		Cal.printonetohundred2();
 		Cal.printonetohundred3();
 		
 		
		} // try block
		
		catch(Exception e) {
			
			e.printStackTrace();
		} // catch block
	}// main block
	
	
	public int FindMinNum (int n1, int n2) throws Exception {
		
		int minNum = 0;
		if (n1 > n2) { minNum = n2;   }
		
		else if (n1==n2) {                 
			System.out.println("numbers are equal");
			throw new Exception();
			
		}
		
		else  { minNum= n1;   }
				
				return minNum;
	}
	
	public void printonetohundred() {
		
		for (int i=1; i<=100; i++) {
			
		System.out.println("i: "+ i);
		}
		
	}
	
	
	public void printonetohundred1() {
		int i =1;
		while(true) {
			
			System.out.println("i= "+ i);
			if (i==100) {break;}
			i++;
		}
		
	}
	
	
	public void printonetohundred2() {
		
		int i=1;
		while (i<= 100) {
			System.out.println("i:: " +i);
			i++;
			
		}
	}

	
	public void printonetohundred3() {
		
		    int i =1;
		do {
			System.out.println("i''" + i);
			i++;
		}while (i<=100);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
