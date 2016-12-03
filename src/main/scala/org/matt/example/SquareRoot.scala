package org.matt.example

object SquareRoot {
  def sqrt(i: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      Simple.abs(Simple.square(guess) - i) <= math.ulp(i)

    def improve(guess: Double) =
      (guess + i / guess) / 2

    sqrtIter(1.0)
  }

}
