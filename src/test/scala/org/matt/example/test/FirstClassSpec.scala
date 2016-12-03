package org.matt.example.test

import org.matt.example.FirstClass

class FirstClassSpec extends UnitSpec {
  "Fist class function examples" should "sum all integers between two given numbers" in {
    FirstClass.sumInts(1, 4) should be(10)
  }

  it should "sum the squares of all integer between two given numbers" in {
    FirstClass.sumSquares(1, 5) should be(55)
  }

  it should "sum the powers 2^n of all integers n between two given numbers" in {
    FirstClass.sumPowersOfTwo(1, 4) should be(30)
  }

  it should "compute the produce of values of functions between a range" in {
    FirstClass.productInts(2,4) should be (24)
  }
}

