package easy

/**
 * https://leetcode.com/problems/power-of-two/
 */
class PowerOfTwo {

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

  def test = {
    List(0, 3, 5, 15, 123123123, Int.MaxValue).foreach{ e =>
      assert(isPowerOfTwo(e) == false)
    }

    List(1, 4, 16, 1048576, 1073741824).foreach{ e =>
      assert(isPowerOfTwo(e) == true)
    }
  }


}
