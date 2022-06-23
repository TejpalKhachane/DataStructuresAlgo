package my.ds.tree.binaryTree;

public class InsertBinaryTree {

	public static void main(String[] args) {
		int arr[] = new int[20];
		arr[0] = 00;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 50;
		arr[4] = 100;
		for (int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println("");
		System.out.println(new InsertBinaryTree().insertSorted(arr, 5, arr.length, 101));
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}

	private int insertSorted(int[] arr, int n, int capacity, int key) {
		if (n >= capacity) {
			return -1;
		}
		
		int i = 0;
		for (i = (n - 1); (i >= 0 && arr[i] >= key); i--) {
			arr[i + 1] = arr[i];
		}

		arr[i + 1] = key;

		return (n + 1);
	}

}
