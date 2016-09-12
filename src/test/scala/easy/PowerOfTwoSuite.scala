package easy

import easy.PowerOfTwo.isPowerOfTwo
import org.scalatest.FunSpec

/**
  * Created by rumata on 9/12/16.
  */
class PowerOfTwoSuite extends FunSpec {

  List(0, 3, 5, 15, 123123123, Int.MaxValue).foreach { e =>
    assert(isPowerOfTwo(e) == false)
  }

  List(1, 4, 16, 1048576, 1073741824).foreach { e =>
    assert(isPowerOfTwo(e) == true)
  }

}
