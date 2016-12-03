package org.matt.example.test

import org.matt.example.Simple

class SimpleSpec extends UnitSpec {
  "Simple" should "add stuff together" in {
    Simple.add(1,2) should be (3)
  }

  it should "do multiple types of math" in {
    Simple.addAndMultiply(5,2,3) should be (11)
  }

  it should "square values" in {
    Simple.square(2) should be (4)
  }

  it should "sum squares" in {
    Simple.sumOfSquares(3, 2 + 2) should be (25.0)
  }

  it should "take the absolute value" in {
    Simple.abs(-3) should be (3)
  }
}
