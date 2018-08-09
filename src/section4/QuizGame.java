package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		int score = 0;
		// 1.  Create a variable to hold the user's score 
		for (int i = 0 ; i< 10;i++) {
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Whats your name?");
		// 3.  Use an if statement to check if their answer is correct
	 { 
			score++; 
			JOptionPane.showMessageDialog(null, "(^_^)");
		// 4.  if the user's answer is correct
			String answer2 = JOptionPane.showInputDialog("Whats the color of the sky?");
		// -- add one to their score 
					if(answer2.equals("blue"));
					JOptionPane.showMessageDialog(null, "(^_^)");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
					String answer3 = JOptionPane.showInputDialog("Whats the opposite of down?");
					
					JOptionPane.showMessageDialog(null, ""+ answer + " " + answer2 + " " + answer3 + ".");
					
					JOptionPane.showMessageDialog(null," lol");
					

		// 6.  After all the questions have been asked, print the user's score.
		}
	}
	}
}
