package medium

import org.scalatest.FunSuite
import DivideTwoIntegers.divide

/**
  * Created by rumata on 9/12/16.
  */
class DivideTwoIntegersSuite extends FunSuite {
  assert(divide(10, 10) == 1)
  assert(divide(-10, -10) == 1)
  assert(divide(-10, 10) == -1)
  assert(divide(10, -10) == -1)
  assert(divide(100, 4) == 25)
  assert(divide(100, 0) == Integer.MAX_VALUE)
  assert(divide(33, 11) == 3)
}
