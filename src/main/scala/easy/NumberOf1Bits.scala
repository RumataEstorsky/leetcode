package easy

/**
 * Created by rumata on 8/7/15.
 */
object NumberOf1Bits {

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


}
