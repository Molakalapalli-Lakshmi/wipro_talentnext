package arrays_java;

public class Arrays7 {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 12, 45, 67, 89 };
		int n = arr.length;

		System.out.print("I/P:{");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if (i != n - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");

		System.out.print("O/P:{");
		boolean first = true;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				if (!first) {
					System.out.print(", ");
				}
				System.out.print(arr[i]);
				first = false;
			}
		}
		System.out.println("}");
	}
}