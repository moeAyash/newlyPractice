package com.java.List;

import java.util.Scanner;

public class AqeelProblem1Class {

	public static void main(String[] args) {
		
		
		String ScoreString = "";
		Scanner sc = new Scanner(System.in);
		ScoreString=sc.nextLine();
		int Score = Integer.parseInt(ScoreString);
		if (Score>=90) {System.out.println("Your Grade is: "+ "A");}
		else if (Score>=80 && Score <90) {System.out.println("Your Grade is: "+ "B");}
		else if (Score>=70 && Score <80) {System.out.println("Your Grade is: "+ "C");}
		else if (Score>=60 && Score <70) {System.out.println("Your Grade is: "+ "D");}
		else System.out.println("You Are Failed, Your Score is: "+"F");

	}

}
