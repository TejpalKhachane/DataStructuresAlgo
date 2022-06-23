package my.ds.sort;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int arr[] = new int[] { 9, 6, 5, 8, 5, 3, 7, 3 };
		new InsertionSortDemo().inertionSort(arr);
		System.out.println(Arrays.toString(arr));

		arr = new int[] {};
		new InsertionSortDemo().inertionSort(arr);
		System.out.println(Arrays.toString(arr));

		arr = new int[] { 5 };
		new InsertionSortDemo().inertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private void inertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i]; // element to be inserted
			int j = i - 1;
			
			// make a place for current element
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
			System.out.println(Arrays.toString(arr));
		}
	}
}
