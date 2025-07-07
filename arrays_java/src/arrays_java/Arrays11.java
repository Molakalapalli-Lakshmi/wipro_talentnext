package arrays_java;

import java.util.Arrays;

public class Arrays11 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 1, 4 };
		int[] arr2 = { 1, 4, 2, 4 };
		int[] arr3 = { 1, 1 };
		checkAndPrint(arr1);
		checkAndPrint(arr2);
		checkAndPrint(arr3);
	}

	public static boolean only14(int[] arr) {
		for (int num : arr) {
			if (num != 1 && num != 4) {
				return false;
			}
		}
		return true;
	}

	public static void checkAndPrint(int[] arr) {
		System.out.println("only14(" + Arrays.toString(arr) + ") → " + only14(arr));
	}
}
