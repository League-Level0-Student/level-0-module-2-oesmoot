package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_ticket {
public static void main(String[] args) {
	Random ran = new Random();
	
	int lotNum1 = ran.nextInt(100);
	int lotNum2 = ran.nextInt(100);
	int lotNum3 = ran.nextInt(100);
	int lotNum4 = ran.nextInt(100);
	int lotNum5 = ran.nextInt(100);
	int lotNum6 = ran.nextInt(100);
	
	JOptionPane.showMessageDialog(null, lotNum1+" "+lotNum2+" "+lotNum3+" "+lotNum4+" "+lotNum5+" "+lotNum6+" ");
}
}
