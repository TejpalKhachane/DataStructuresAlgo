package my.ds.lcm;

class LCM {
	public static void main(String[] args) {
		int array[] = { 16, 32, 96 };

		// initialize LCM and GCD with the first element
		int lcm = array[0];
		int gcd = array[0];

		// loop through the array to find GCD
		// use GCD to find the LCM
		for (int i = 1; i < array.length; i++) {
			gcd = findGCD(array[i], lcm);
			//System.out.println(array[i] + " " + lcm + " - " + gcd);
			lcm = (lcm * array[i]) / gcd;
		}

		// output the LCM
		System.out.println("LCM: " + lcm);
		System.out.println("GCD: " + gcd);
		
		calcLcm(array);
	}

	// recursive function to find GCD of two numbers
	public static int findGCD(int a, int b) {
		// base condition
		if (b == 0)
			return a;

		return findGCD(b, a % b);
	}

	public static void calcLcm(int array[]) {
		int min, x, max, lcm = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {

				if (array[i] > array[j]) {
					min = array[j];
					max = array[i];
				} else {
					min = array[i];
					max = array[j];
				}
				for (int k = 0; k < array.length; k++) {
					x = k * max;
					if (x % min == 0) {
						lcm = x;
					}
				}
			}
		}
		System.out.println("LCM of the given array of numbers : " + lcm);
	}
}