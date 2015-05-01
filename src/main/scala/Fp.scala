package com.github.edwardsmatt.fpinscala;

import annotation.tailrec;

object Fp {
	/** Exercise 2.1. This will overflow trying to get the Fibonnacci number 47 or higher (we should convert it to use BigInt) */
	def fib(n: Int): Int = {
		
		@tailrec
		def go(n: Int, acc: Int, a: Int, b: Int): Int = {
			if (acc == n) a
			else go(n, acc + 1, b, a+b)
		}
		go (n, 0, 0, 1)
	}

	/** Exercise 2.2. */
	def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {

		@tailrec
		def go(n: Int): Boolean = {
			if (n >= as.length -1) true
			else if (!ordered(as(n), as(n+1))) false
			else go(n+1)
		}
		go(0)
	}
}