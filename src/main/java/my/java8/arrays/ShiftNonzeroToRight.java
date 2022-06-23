package my.java8.arrays;

public class ShiftNonzeroToRight {

	public static void main(String[] args) {
		int [] array = {1,3,4,0,0,5,0,2,9,0};
		for (int num : array) {
			System.out.print(num+" ");	
		}
		int count =0;
		for (int i=0; i< array.length; i++) {
			if (array[i]!=0) {
				array[count++] = array[i];
			}
		}
		
		while(count<array.length) {
			array[count++]=0;
		}
		System.out.println("");	
		for (int num : array) {
			System.out.print(num+" ");	
		}
	}
}
