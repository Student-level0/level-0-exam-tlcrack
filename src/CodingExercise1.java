import java.awt.Color;
import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	Robot t = new Robot();
   	t.penDown();
    	// 3. ask the user what color they would like the Robot to draw
String s = JOptionPane.showInputDialog("what color do you want the robot to draw with?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

if(s.equalsIgnoreCase("blue")) {
	t.setPenColor(Color.blue);
}
else if(s.equalsIgnoreCase("green")) {
	t.setPenColor(Color.green);
}
else if(s.equalsIgnoreCase("purple")) {
	t.setPenColor(Color.magenta);
}
else if(s.equalsIgnoreCase("yellow")) {
	t.setPenColor(Color.yellow);
}
else if(s.equalsIgnoreCase("orange")) {
	t.setPenColor(Color.orange);
}
else if(s.equalsIgnoreCase("red")) {
	t.setPenColor(Color.red);
}
else {
	JOptionPane.showMessageDialog(null, "I don't know that color.");
}
   	 // 2. set the pen width to 10
t.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 t.move(100);
   	 t.turn(90);
   	t.move(100);
  	 t.turn(90);
  	t.move(100);
  	 t.turn(90);
  	t.move(100);
    }

}
