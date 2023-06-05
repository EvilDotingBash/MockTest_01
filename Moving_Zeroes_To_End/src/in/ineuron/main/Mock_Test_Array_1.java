package in.ineuron.main;

import java.util.Iterator;
import java.util.Scanner;

public class Mock_Test_Array_1 {

	public static void main(String[] args) {

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements of array");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before moving zeroes to end...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		int j, t = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				while (arr[j] == 0 && j < arr.length - 1) {
					j++;
				}
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		System.out.println();
		
		System.out.println("After moving zero to end...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

}
