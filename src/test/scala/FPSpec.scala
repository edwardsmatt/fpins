package com.github.edwardsmatt.fpinscala

import org.scalatest._
import OptionValues._
import EitherValues._
import Fp._


class Fp2_2Spec extends FlatSpec with Matchers {

	val ascending = (a: Int, b: Int) => (a < b)

	"isSorted" should "return false with an unsorted array" in {
		val instance = isSorted(Array(1, 3, 2, 5, 4, 6), ascending)
		instance should be (false)
	}

	it should "return true if the array is sorted in ascending order" in {
		val instance = isSorted(Array(1, 2, 3, 4, 5, 6, 7, 8), ascending)
		instance should be (true)
	}

	val descending = (a: Int, b: Int) => (a > b)
	it should "return true if the array is sorted in descending order" in {
		val instance = isSorted(Array(8, 7, 6, 5, 4, 3, 1), descending)
		instance should be (true)
	}

	val alphabeticalAscending = (a: String, b: String) => (a < b)
	it should "return true if the array is sorted in alphabetical ascending order" in {
		val instance = isSorted(Array("aardvark", "apple", "banana"), alphabeticalAscending)
		instance should be (true)
	}

	it should "return false if the array is not sorted in alphabetical ascending order" in {
		val instance = isSorted(Array("zebra", "aardvark", "apple", "banana"), alphabeticalAscending)
		instance should be (false)
	}
}

class Fp2_1Spec extends FlatSpec with Matchers {

	"Getting the 9th Fibonnacci number" should "return the 34" in {
		val instance = fib(9)
		val expected = 34
		instance should be (expected)
	}

	"Getting the 10th Fibonnacci number" should "return the 55" in {
		val instance = fib(10)
		val expected = 55
		instance should be (expected)
	}

	"Getting the 11th Fibonnacci number" should "return the 89" in {
		val instance = fib(11)
		val expected = 89
		instance should be (expected)
	}
}
