package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		// double random = Math.random();
		int k = 100;

		if (!"".equals(args[0])) {

			k = Integer.parseInt(args[0]);
		}

		ArrayList<Double> numbers = new ArrayList();

		for (int i = 0; i < k; i++) {
			numbers.add(Math.random());
		}

		Collections.sort(numbers);
		System.out.println(numbers);
	}
}
