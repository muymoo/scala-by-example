package org.matt.example

object SquareRoot {
  def sqrt(x: Double): Double = fixedPoint(y => (y + x / y) / 2)(1.0)

  def isCloseEnough(x: Double, y: Double): Boolean = Simple.abs((x - y) / x) < Math.ulp(x)

  def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }
}
