package my.ds.sort;

import java.util.Arrays;

public class BubbleSortDemo {
	public static void main(String[] args) {
		int arr[] = new int[] { 9, 6, 5, 8, 5, 3, 7, 3 };
		new BubbleSortDemo().bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

		arr = new int[] {};
		new BubbleSortDemo().bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

		arr = new int[] { 5 };
		new BubbleSortDemo().bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private void bubbleSort(int[] arr) {
		boolean isSorted;
		for (int i = 0; i < arr.length; i++) {
			isSorted = true;
			// last elements are already sorted so arr.length-i, reduce no of checks
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					swapElements(arr, j);
					isSorted = false;
				}
				System.out.println(Arrays.toString(arr));
			}
			// if no swaps were made in last pass, then the array is already sorted,
			// then return immediately
			if (isSorted) {
				return;
			}
		}
	}

	// modularize code
	private void swapElements(int[] arr, int indx) {
		int temp = arr[indx];
		arr[indx] = arr[indx - 1];
		arr[indx - 1] = temp;
	}
}
