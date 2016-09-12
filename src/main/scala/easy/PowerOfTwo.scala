package easy

/**
 * https://leetcode.com/problems/power-of-two/
 */
object PowerOfTwo {

  def isPowerOfTwo(n: Int): Boolean =
    if(n == 0) false
    else {
      var remainder = n;
      while(remainder >= 2) {
        val half = remainder / 2
        if(half != remainder - half) {
          return false
        }
        remainder = half
      }
      true
  }

}
