package org.matt.example

import scala.annotation.tailrec

object Factorial {
  def factorial(i: Int): Int = {
    @tailrec def factorial(i: Int, product: Int): Int = {
      if (i == 0) product
      else factorial(i - 1, product * i)
    }
    factorial(i, 1)
  }
}
