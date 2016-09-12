package easy

import org.scalatest.FunSuite
import easy.MajorityElement.majorityElement

/**
  * https://leetcode.com/problems/majority-element/
  * http://stackoverflow.com/questions/13878104/finding-the-most-frequent-common-element-in-a-collection
  */
class MajorityElementSuite extends FunSuite {

  assert(majorityElement(List(11, 23, 11, 22, 5, 11, 8, 5, 11, 11)) == 11)
  assert(majorityElement(List(1, 2, 4, 2, 1, 2)) == 2)
}
