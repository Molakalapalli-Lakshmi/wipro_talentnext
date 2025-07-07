package arrays_java;

import java.util.Scanner;

public class Arrays8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		boolean skip = false;
		for (int num : arr) {
			if (num == 6) {
				skip = true;
				continue;
			}
			if (skip && num == 7) {
				skip = false;
				continue;
			}
			if (!skip) {
				sum += num;
			}
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}

}
