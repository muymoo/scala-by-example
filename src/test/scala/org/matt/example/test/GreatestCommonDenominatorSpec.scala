package org.matt.example.test

import org.matt.example.GreatestCommonDenominator

class GreatestCommonDenominatorSpec extends UnitSpec {

  "GCD" should "find the greatest common denominator between two numbers" in {
    GreatestCommonDenominator.gcd(14, 21) should be (7)
  }

}
