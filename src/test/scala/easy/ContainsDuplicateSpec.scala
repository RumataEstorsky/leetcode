package easy

import org.scalatest.FunSuite
import easy.ContainsDuplicate.containsDuplicate

/** https://leetcode.com/problems/contains-duplicate/ */
class ContainsDuplicateSpec extends FunSuite {


  test("This sequence [1,3,4,5,6,7,9,10,10,11] contains duplicate (10):") {
    assert(containsDuplicate(Array(1,3,4,5,6,7,9,10,10,11)) == true)
  }

  test("This sequence [11,3,4,5,6,7] does not contain any duplicate:") {
    assert(containsDuplicate(Array(1, 3, 4, 5, 6, 7)) == false)
  }

}
