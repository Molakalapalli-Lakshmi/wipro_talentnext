package arrays_java;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}

}
