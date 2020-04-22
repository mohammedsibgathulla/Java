package com.java8.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LamdaExpressions {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(11);
		list.add(7);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(23);

		// Sequential and Parallel Execution Support
		System.out.println(isPrimeTraditional(31));
		System.out.println(isPrimeUsingLamdas(31));
		System.out.println(isPrimeUsingLamdasMoreReadable(31));

		// Passing Behaviors into methods
		// sum of all numbers
		System.out.println(sumWithCondition(list, n -> true));
		// sum of all even numbers
		System.out.println(sumWithCondition(list, i -> i % 2 == 0));
		// sum of all numbers greater than 5
		System.out.println(sumWithCondition(list, i -> i > 5));

		// Higher Efficiency with Laziness
		System.out.println(findSquareOfMaxOdd(list));
		System.out.println(findSquareOfMaxOddWithLamdas(list));

	}

	// Sequential and Parallel Execution Support

	// Traditional approach
	private static boolean isPrimeTraditional(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	// Declarative approach
	private static boolean isPrimeUsingLamdas(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}

	private static boolean isPrimeUsingLamdasMoreReadable(int number) {
		IntPredicate isDivisible = index -> number % index == 0;

		return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);
	}

	// Passing Behaviors into methods
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
		return numbers.parallelStream().filter(predicate).mapToInt(i -> i).sum();
	}

	// Higher Efficiency with Laziness
	private static int findSquareOfMaxOdd(List<Integer> numbers) {
		int max = 0;
		for (int i : numbers) {
			if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
				max = i;
			}
		}
		return max * max;
	}

	private static int findSquareOfMaxOddWithLamdas(List<Integer> numbers) {
		// Predicate is functional interface and we are using lambdas to initialize it rather than anonymous inner classes
		return numbers.stream().filter(LamdaExpressions::isOdd) // .filter(i -> isOdd(i)) or .filter(i -> LamdaExpressions.isOdd(i)) 
				.filter(LamdaExpressions::isGreaterThan3) //.filter(i -> LamdaExpressions.isGreaterThan3(i)) or i -> isGreaterThan3(i)
				.filter(LamdaExpressions::isLessThan11)  
				.max(Comparator.naturalOrder()).map(i -> i * i).get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}

	public static boolean isGreaterThan3(int i) {
		return i > 3;
	}

	public static boolean isLessThan11(int i) {
		return i < 11;
	}

}
