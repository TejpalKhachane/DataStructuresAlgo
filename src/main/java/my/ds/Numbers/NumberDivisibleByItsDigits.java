package my.ds.Numbers;

public class NumberDivisibleByItsDigits {

	public static void main(String[] args) {
		System.out.println(new NumberDivisibleByItsDigits().findDigits(12345));
	}

	public static int findDigits(int n) {
		int count = 0;
		String st = n + "";
		int i = 0;
		while (i < st.length()) {
			Character c = st.charAt(i);
			int d = c - '0';
			if (d != 0 && n % d == 0) {
				count++;
			}
			i++;
		}

		// System.out.println("n - "+ n +" count - "+count);
		return count;
	}

}
