package arrays_java;

import java.util.Arrays;

public class Arrays10 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 1, 0, 0, 1, 1 };
		int[] arr2 = { 3, 2, 3 };
		int[] arr3 = { 2, 2, 2 };
		evenOdd(arr1);
		evenOdd(arr2);
		evenOdd(arr3);
	}

	public static void evenOdd(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				result[index] = num;
				index++;
			}
		}
		for (int num : arr) {
			if (num % 2 != 0) {
				result[index] = num;
				index++;
			}
		}
		System.out.println("evenOdd(" + Arrays.toString(arr) + ") → " + Arrays.toString(result));
	}

}
