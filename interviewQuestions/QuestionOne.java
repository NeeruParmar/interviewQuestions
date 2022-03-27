package interviewQuestions;

public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question 1:: Write a program to reverse a string and check if it is a palindrome. 
//two string method used :1) string.length() to find how many characters in given string
//2.) chartAt(index): to find the which which character is present at given index				
		String townName = "Burggrub";
		// Burggrub town in Germany
		String reverse = "";
		for (int i = townName.length() - 1; i >= 0; i--) {
			reverse = reverse + townName.charAt(i);
		}

		if (townName.equalsIgnoreCase(reverse)) {
			System.out.println("Reverse of given name is  " + reverse);
			System.out.println("given String is Pallindrome");

		} else {

			System.out.println("its not a pallin");
		}
	}

}
