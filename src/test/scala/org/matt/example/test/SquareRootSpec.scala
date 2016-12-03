package org.matt.example.test

import org.matt.example.SquareRoot

class SquareRootSpec extends UnitSpec {

  "SquareRoot" should "find the square root" in {
    SquareRoot.sqrt(4) should be (2)
  }

}
