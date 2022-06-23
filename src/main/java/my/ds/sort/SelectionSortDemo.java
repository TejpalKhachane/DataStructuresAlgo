package my.ds.sort;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {

		int arr[] = new int[] { 9, 6, 5, 8, 5, 3, 7, 3 };
		new SelectionSortDemo().selectionSort(arr);
		System.out.println(Arrays.toString(arr));

		arr = new int[] {};
		new SelectionSortDemo().selectionSort(arr);
		System.out.println(Arrays.toString(arr));

		arr = new int[] { 5, 4, 8 };
		new SelectionSortDemo().selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			//System.out.println(smallest);
			// swap smallest with first or ith element
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
