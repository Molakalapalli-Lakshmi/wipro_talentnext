package java_fundamentals;

import java.util.Scanner;

public class Question19 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
        sc.close();
	}

}