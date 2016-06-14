package easy

/**
 * Created by rumata on 8/7/15.
 */
class NumberOf1Bits {

  def hammingWeight(n: Int) = {
    var result = 0
    var i = n
    while(i > 0) {
      if((i & 1) == 1) {
        result = result +1
      }
      i = i >> 1
    }
    result
  }

  def test = {
    assert(hammingWeight(44) == 3)
    assert(hammingWeight(11) == 3)
    assert(hammingWeight(0) == 0)
    assert(hammingWeight(1) == 1)
    assert(hammingWeight(99999999) == 19)
  }


}
