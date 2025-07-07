package arrays_java;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest 2 numbers are: " + arr[n - 1] + " and " + arr[n - 2]);
		System.out.println("Smallest 2 numbers are: " + arr[0] + " and " + arr[1]);
		sc.close();
	}
}
