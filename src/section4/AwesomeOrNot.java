package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	
	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random = new Random().nextInt(4);

// 3. Print out this variable
System.out.println(random);
	
// TODO Auto-generated method stub
String answer = JOptionPane.showInputDialog("Gimmie a word");

// 4. Get the user to enter something that they think is awesome

	
// 5. If the random number is 0

	if (random == 0) {
		JOptionPane.showMessageDialog(null, answer + " Is AWESOME");speak(answer + " Is AWESOME");
	
	}
// -- tell the user whatever they entered is awesome!

	
// 6. If the random number is 1

if (random == 1) {
	JOptionPane.showMessageDialog(null, answer + " Is good.......");speak( answer + " Is good");}

// -- tell the user whatever they entered is OK.


// 7. If the random number is 2
if (random == 2) {
	JOptionPane.showMessageDialog(null, answer + " Is uh ok......");speak( answer +" Is uh ok");}

// -- tell the user whatever they entered is boring.

	
// 8. If the random number is 3
if (random == 3) {
	JOptionPane.showMessageDialog(null, " ugh it's " + answer + "");speak(" ugh it's " + answer + "");}

// -- write your own answer
}
static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}
}


