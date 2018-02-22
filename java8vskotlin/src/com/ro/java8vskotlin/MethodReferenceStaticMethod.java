package com.ro.java8vskotlin;

import java.util.Arrays;
import java.util.List;
/**
 * https://www.boraji.com/java-8-method-references-introduction-with-examples
 * @author kahrxo
 *
 */
public class MethodReferenceStaticMethod {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(20, 10, 15, 24, 55, 47, 16, 87, 88);
		// Print even numbers using lambda expression
		System.out.println("------------- Lamda Results --------------------");
		numbers.stream()
				.filter((n) -> EvenOddCheck.isEven(n))
				.forEach((n) -> System.out.println(n));
		
		// Print even numbers using method references
		System.out.println("------------- Method Reference Results --------");
		numbers.stream()
			   .filter(EvenOddCheck::isEven)
			   .forEach(System.out::println);
	}

	static class EvenOddCheck {
		public static boolean isEven(int n) {
			return n % 2 == 0;
		}

		private EvenOddCheck() {
		}
	}
}
