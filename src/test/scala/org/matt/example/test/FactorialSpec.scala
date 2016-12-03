package org.matt.example.test

import org.matt.example.Factorial

class FactorialSpec extends UnitSpec {

  "Factorial" should "multiply all numbers from n to 1" in {
    Factorial.factorial(5) should be (120)
  }

}
