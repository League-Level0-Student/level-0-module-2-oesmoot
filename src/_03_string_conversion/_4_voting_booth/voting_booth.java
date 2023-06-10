package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("how old are you?");
	int ageInt = Integer.parseInt(age);
	if (ageInt > 17) {
		JOptionPane.showInputDialog("who should be the next president?");
	}
	else {
		JOptionPane.showMessageDialog(null, "nobody cares about your opinion, you are too young!");
	}
}
}
