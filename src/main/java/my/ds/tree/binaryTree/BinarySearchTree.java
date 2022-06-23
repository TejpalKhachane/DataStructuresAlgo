package my.ds.tree.binaryTree;

public class BinarySearchTree {

	public static void main(String[] args) {
		int array[] = new int[] { 3, 6, 9, 10, 15, 20, 25, 35, 50, 85, 90, 100 };
		int n = array.length - 1;
		int key = 50;

		System.out.println(new BinarySearchTree().binarySearch(array, 0, n, key));
		System.out.println(new BinarySearchTree().binarySearch(array, 0, n, 6));
		System.out.println(new BinarySearchTree().binarySearch(array, 0, n, 55));
	}

	private int binarySearch(int[] arr, int low, int high, int key) {
		
		if (high < low) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (key == arr[mid]) {
			return mid;
		}
		
		if (key > arr[mid]) {			
			return binarySearch(arr, (mid + 1), high, key);
		}

		return binarySearch(arr, low, (mid - 1), key);
	}

}
