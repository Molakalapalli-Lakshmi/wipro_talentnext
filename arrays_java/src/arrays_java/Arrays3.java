package arrays_java;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to search: ");
		int number = sc.nextInt();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		sc.close();
	}

}
