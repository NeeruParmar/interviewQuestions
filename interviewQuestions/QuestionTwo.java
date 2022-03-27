package interviewQuestions;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//: Write a program to find if the number is prime or not. 	
		
//PM: any natural number which is greater than one which has only two factors 1 and itself 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int countFactor = 0;

		if (num > 1) {

			for (int forCounter = 1; forCounter <= num; forCounter++) {
				if (num % forCounter == 0)
					countFactor++;
			}
			if (countFactor == 2) {
				System.out.println("Entered number  is a Prime Num");

			} else {
				System.out.println(" Entered number not a Prime number");
			}
		}
	}
}