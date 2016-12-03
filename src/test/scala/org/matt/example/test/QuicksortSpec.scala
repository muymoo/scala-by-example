package org.matt.example.test

import org.matt.example.Quicksort
import org.scalatest._


class QuicksortSpec extends UnitSpec {

  "Quicksort" should "make order of chaos" in {
    Quicksort.sort(Array(3,1,2)) should be (Array(1,2,3))
  }
}
