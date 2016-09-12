package easy

import org.scalatest.FunSuite
import easy.ContainsDuplicate.containsDuplicate

/** https://leetcode.com/problems/contains-duplicate/
  *
  * Given an array of integers, find if the array contains any duplicates.
  * Your function should return true if any value appears at least twice in the array,
  * and it should return false if every element is distinct.
  *
  * */
class ContainsDuplicateSuite extends FunSuite {

  test("This sequence [1,3,4,5,6,7,9,10,10,11] contains duplicate (10):") {
    assert(containsDuplicate(Array(1,3,4,5,6,7,9,10,10,11)) == true)
  }

  test("This sequence [11,3,4,5,6,7] does not contain any duplicates:") {
    assert(containsDuplicate(Array(1, 3, 4, 5, 6, 7)) == false)
  }

}
