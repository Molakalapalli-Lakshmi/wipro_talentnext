package java_fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first non negative number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second non negative number: ");
		int n2 = sc.nextInt();
		if((n1 % 10) == (n2 % 10)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
        sc.close();
	}

}