package com.ro.kotlin

/***	
 * Kotlin uses functions instead of a static class.  No method reference, just lambda
 */
fun isEven(n: Int) : Boolean {
	return n % 2 == 0
}
/***
 * function with expression body and inferred return type
 */
fun isEven2(n: Int) : Boolean = n % 2 == 0

fun main(args: Array<String>)  {

	val numbers = listOf(20, 10, 15, 24, 55, 47, 16, 87, 88)
	
	System.out.println("------------- Lamda Results --------------------");
	numbers.filter { isEven(it) }
		   .forEach { println(it)}

}