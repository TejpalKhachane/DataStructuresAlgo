package my.ds.lcm;

public class FactorsBetweenSets {

	public static void main(String[] args) {
		/*
		 * int arrayA[] = { 2, 4 }; int arrayB[] = { 16, 32, 96 };
		 */

		int arrayA[] = { 1 };
		int arrayB[] = { 100 };

		int count = 0;
		// initialize LCM and GCD with the first element
		int lcmA = arrayA[0];
		int gcdA = arrayA[0];
		for (int i = 1; i < arrayA.length; i++) {
			gcdA = findGCD(arrayA[i], lcmA);
			lcmA = (lcmA * arrayA[i]) / gcdA;
		}

		System.out.println("LCM: " + lcmA);

		// initialize LCM and GCD with the first element
		int multi = arrayB[0];
		int gcdB = arrayB[0];
		for (int i = 0; i < arrayB.length; i++) {
			multi = (multi * arrayB[i]);
			if (multi % arrayB[i] == 0 && arrayB[i] < gcdB) {
				gcdB = arrayB[i];
			}
		}

		System.out.println("GCD: " + gcdB);
		/*
		 * for (int i = 1; i < 100; i++) { if (gcdB % lcmA == 0) { count++; lcmA = lcmA
		 * + lcmA; } else { System.out.println(gcdB + " " + lcmA + " " + (gcdB % lcmA));
		 * } }
		 */

		while (lcmA <= gcdB) {
			//System.out.println(lcmA);
			if (gcdB % lcmA == 0) {
				count++;
				lcmA = lcmA + 1;
			} 
		}

		System.out.println("Count - " + count);

	}

	// recursive function to find GCD of two numbers
	public static int findGCD(int a, int b) {
		// base condition
		if (b == 0)
			return a;
		return findGCD(b, a % b);
	}

}
