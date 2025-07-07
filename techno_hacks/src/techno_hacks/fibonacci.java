package techno_hacks;
import java.util.Scanner;
public class fibonacci {
	
public static void generateFibonacci(int limit) {
	int a = 0, b = 1;
	System.out.println("Fibonacci sequence up to " + limit + ":");
	while (a <= limit) {
		System.out.print(a + " ");
		int next = a + b;
		a = b;
		b = next;
		}
	System.out.println();
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Fibonacci Sequence Generator");
	System.out.print("Enter the upper limit: ");
	int limit = sc.nextInt();
	generateFibonacci(limit);
	sc.close();
	}
}