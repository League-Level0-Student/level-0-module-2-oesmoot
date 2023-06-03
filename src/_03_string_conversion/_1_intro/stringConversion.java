package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class stringConversion {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog(null, "give me a number");
	int numbre = Integer.parseInt(number);
	JOptionPane.showMessageDialog(null, numbre + 50);
}
}
