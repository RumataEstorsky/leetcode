package medium

import medium.SingleNumber.singleNumber
import org.scalatest.FunSuite

/**
  * Created by rumata on 9/12/16.
  */
class SingleNumberSuite extends FunSuite {

  test("Single number in [1, 1, 0] as 0") {
    assert(singleNumber(List(1, 3, 5, 6, 3, 5, 1)) == 6)
    assert(singleNumber(List(1, 1, 0)) == 0)
    assert(singleNumber(List(0, 0, 4)) == 4)
  }

}
