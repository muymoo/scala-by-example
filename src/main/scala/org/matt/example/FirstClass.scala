package org.matt.example

object FirstClass {

  def productInts: (Int, Int) => Int = product(x => x)

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    applyOperationToFunctionOverRange((x, y) => x * y, f, 1)(a, b)
  }

  def powerOfTwo(i: Int): Int = if (i == 0) 1 else 2 * powerOfTwo(i - 1)

  def sumPowersOfTwo: (Int, Int) => Int = sum(powerOfTwo)

  def sumSquares: (Int, Int) => Int = sum(x => x * x)

  def sumInts: (Int, Int) => Int = sum(x => x)

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    applyOperationToFunctionOverRange((x, y) => x + y, f, 0)(a, b)
  }

  /**
    * This should probably be called MapAndReduce.
    *
    * @example
    * {{{
    * def product(f: Int => Int)(a: Int, b: Int): Int = {
    *   if(a>b) 1 else f(a) * product(f)(a+1, b)
    * }
    * }}}
    * @param operation Operation used to combine results of function (i.e. reduce) Examples include [[FirstClass.sum]] and [[FirstClass.product]]
    * @param function  The function to apply to each Int in range
    * @param intial    Intial value that operation will start on (0 for sum, 1 for product)
    * @param a         Lower bound
    * @param b         Upper bound
    * @return The result of applying the combining operation to the result of function applied to each value in the range.
    */
  def applyOperationToFunctionOverRange(operation: (Int, Int) => Int, function: Int => Int, intial: Int)(a: Int, b: Int): Int = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else iter(a + 1, operation(result, function(a)))
    }

    iter(a, intial)
  }

}
