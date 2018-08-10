package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String name = JOptionPane.showInputDialog(null, "Who do you hate or dislike?");
		JOptionPane.showMessageDialog(null, "I bet thats a lie");
		// 3. Ask the user for the name of their best friend
String friend = JOptionPane.showInputDialog(null, "What is the name of your BFF?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, "I bet " + friend +" is as sweet as a piece of candy lol");
	} 
}



