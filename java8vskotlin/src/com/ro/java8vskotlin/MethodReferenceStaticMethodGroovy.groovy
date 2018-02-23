package com.ro.java8vskotlin

import java.util.Arrays
import java.util.List

import com.ro.java8vskotlin.MethodReferenceStaticMethod.EvenOddCheck

/**
 * Groovy uses closures instead of lambdas or method references
 * @author kahrxo
 *
 */
class MethodReferenceStaticMethodGroovy {

	public static void main(String[] args) {
		def numbers = [20, 10, 15, 24, 55, 47, 16, 87, 88]
		// Print even numbers using lambda expression
		println("------------- Lamda Results --------------------");
		numbers.findAll({EvenOddCheck.isEven(it)})
				.forEach({println(it)});
		
		// Print even numbers using method references
//		println("------------- Method Reference Results --------");
//		numbers.filter(EvenOddCheck::isEven)
//			   .forEach(System.out::println);
	}

	static class EvenOddCheck {
		public static boolean isEven(int n) {
			return n % 2 == 0;
		}

		private EvenOddCheck() {
		}
	}
}
