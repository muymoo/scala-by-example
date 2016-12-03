package org.matt.example

object FirstClass {

  def productInts: (Int, Int) => Int = product(x => x)

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    computeOverRange((x, y) => x * y, f, 1)(a, b)
  }

  def powerOfTwo(i: Int): Int = if (i == 0) 1 else 2 * powerOfTwo(i - 1)

  def sumPowersOfTwo: (Int, Int) => Int = sum(powerOfTwo)

  def sumSquares: (Int, Int) => Int = sum(x => x * x)

  def sumInts: (Int, Int) => Int = sum(x => x)

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    computeOverRange((x, y) => x + y, f, 0)(a, b)
  }

  def computeOverRange(op: (Int, Int) => Int, f: Int => Int, intial: Int)(a: Int, b: Int): Int = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else iter(a + 1, op(result, f(a)))
    }

    iter(a, intial)
  }

}
