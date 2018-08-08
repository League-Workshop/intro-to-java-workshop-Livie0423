package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "What's your name"); 
	JOptionPane.showMessageDialog(null, "Hey " + name +", How are you?");
}
}
