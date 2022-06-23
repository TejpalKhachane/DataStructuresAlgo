package my.ds.LuckyNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// luck number is the one which dont have repetitive digits in it
public class LuckyNumber {

	public static void main(String[] args) {
		int num = 12345;

		System.out.println("1st approach");

		System.out.println(new LuckyNumber().isLuckyNumber(num));
		System.out.println(new LuckyNumber().isLuckyNumber(0));
		System.out.println(new LuckyNumber().isLuckyNumber(1000000));
		System.out.println(new LuckyNumber().isLuckyNumber(472342));

		System.out.println("2nd approach");

		System.out.println(new LuckyNumber().isLuckyNumber2(num));
		System.out.println(new LuckyNumber().isLuckyNumber2(0));
		System.out.println(new LuckyNumber().isLuckyNumber2(1234567890));
		System.out.println(new LuckyNumber().isLuckyNumber2(472342));
	}

	private boolean isLuckyNumber(int num) {
		int luck = num;
		Map<Integer, Integer> map = new HashMap<>();
		while (luck > 0) {
			int digit = luck % 10;
			luck = luck / 10;
			if (map.get(digit) != null) {
				return false;
			} else {
				map.put(digit, 1);
			}
		}
		return true;
	}

	private boolean isLuckyNumber2(int num) {
		int luck = num;
		// using list here as we dont know the number of digits in the number
		List<Integer> list = new ArrayList<>();
		while (luck > 0) {
			int digit = luck % 10;
			luck = luck / 10;
			list.add(digit);
		}

		Object[] digitArray = list.toArray();

		// only one digit, so its a lucky number
		if (digitArray.length == 1) {
			return true;
		}

		// all numbers having more than 10 digits will have repetitive digits
		if (digitArray.length > 10) {
			return false;
		}

		for (int i = 0; i < digitArray.length; i++) {
			for (int j = i + 1; j < digitArray.length; j++) {
				if (digitArray[i] == digitArray[j]) {
					return false;
				}
			}
		}

		return true;
	}

}
