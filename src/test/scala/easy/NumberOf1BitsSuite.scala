package easy

import org.scalatest.FunSuite
import NumberOf1Bits.hammingWeight

/**
  * Created by rumata on 9/12/16.
  */
class NumberOf1BitsSuite extends FunSuite {

  assert(hammingWeight(44) == 3)
  assert(hammingWeight(11) == 3)
  assert(hammingWeight(0) == 0)
  assert(hammingWeight(1) == 1)
  assert(hammingWeight(99999999) == 19)

}
