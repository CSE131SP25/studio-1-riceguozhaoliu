package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Person 1 name: ");
		String s0 = in.nextLine();
		System.out.print("Person 2 name: ");
		String s1 = in.nextLine();
		System.out.print("Person 3 name: ");
		String s2 = in.nextLine();
		System.out.print("Person 4 name: ");
		String s3 = in.nextLine();
		System.out.print("Hello " + s0 + ", " + s1 + ", " + s2 + ", " + s3 + ", it's nice to meet you!");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
