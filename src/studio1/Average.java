package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please choose an integer number:");
		int n1 = in.nextInt();
		System.out.print("Please choose a second integer number:");
		int n2 = in.nextInt();
		double avg = (((double)n1 + (double)n2)/2);
		System.out.print("The average of these numbers is: " + avg);
	}

}
