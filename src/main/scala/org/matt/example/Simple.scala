package org.matt.example

object Simple {
  def abs(i: Double): Double = if (i >= 0) i else -i

  def sumOfSquares(i: Int, j: Int): Double = square(i) + square(j)

  def square(i: Double): Double = i * i

  def addAndMultiply(i: Int, j: Int, k: Int): Int = i + j * k

  def add(l: Int, r: Int): Int = l + r
}
