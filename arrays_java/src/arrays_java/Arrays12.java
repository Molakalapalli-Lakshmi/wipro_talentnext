package arrays_java;

import java.util.Arrays;

public class Arrays12 {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3 };
		int[] b1 = { 4, 5, 6 };
		middleWay(a1, b1);

		int[] a2 = { 7, 7, 7 };
		int[] b2 = { 3, 8, 0 };
		middleWay(a2, b2);

		int[] a3 = { 5, 2, 9 };
		int[] b3 = { 1, 4, 5 };
		middleWay(a3, b3);
	}

	public static void middleWay(int[] a, int[] b) {
		int[] result = { a[1], b[1] };
		System.out.println(
				"middleWay(" + Arrays.toString(a) + ", " + Arrays.toString(b) + ") → " + Arrays.toString(result));
	}

}
