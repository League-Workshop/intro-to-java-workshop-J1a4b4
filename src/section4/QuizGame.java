package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
	int score = 0;
		// 2.  Ask the user a question 
	String answer1 = JOptionPane.showInputDialog(null, "Who wrote 'Great Expectations'?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer1.equals("Charles Dickens")) {
		score = score + 1;
		}
		String answer2 = JOptionPane.showInputDialog(null, "What is the most densely populated country in the world?");
		if (answer2.equals("India")) {
		score = score + 1;
		}
		String answer3 = JOptionPane.showInputDialog(null, "True or False: The Fourth of July is the day the British surrendered.");
		if (answer3.equals("False")) {
		score = score + 1;
		}
		String answer4 = JOptionPane.showInputDialog(null, "True or False: Jellyfish have no heart or brain.");
		if (answer4.equals("True")) {
		score = score + 1;
		}
		String answer5 = JOptionPane.showInputDialog(null, "Did NASA discontinue the shuttle program?");
		if (answer5.equals("Yes")) {
		score = score + 1;
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is " + score + " out of 5.");
	}
}
