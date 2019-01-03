package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int randnum = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(randnum);
	// 4. Get the user to enter something that they think is awesome
String awesome = JOptionPane.showInputDialog(null, "Please enter something that you think is awesome.");
	// 5. If the random number is 0
if (randnum == 0) {
	JOptionPane.showMessageDialog(null, awesome + " is awesome!");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (randnum == 1) {
	JOptionPane.showMessageDialog(null, awesome + " is okay.");
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if (randnum == 2) {
	JOptionPane.showMessageDialog(null, awesome + " is boring.  Why do you think it is awesome?");
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if (randnum == 3) {
	JOptionPane.showMessageDialog(null, awesome + " sucks, and so do you!");
} 
	// -- write your own answer
}
}


