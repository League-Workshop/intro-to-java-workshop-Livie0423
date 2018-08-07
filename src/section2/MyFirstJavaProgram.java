package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot genos = new Robot();
		genos.setSpeed(100);
		genos.sparkle();
	genos.penDown(); 
	genos.setRandomPenColor();
		for(int i=0;i<4;i++) {
			genos.move(100);
			genos.turn(90);
		}
	}
}
