package easy

// https://leetcode.com/problems/majority-element/
// http://stackoverflow.com/questions/13878104/finding-the-most-frequent-common-element-in-a-collection
// overhead?

class MajorityElement {

  def majorityElement(nums: List[Int]) = nums.groupBy(identity).maxBy(_._2.size)._1

  def test = {

    assert(majorityElement(List(11, 23, 11, 22, 5, 11, 8, 5, 11, 11)) == 11)
    assert(majorityElement(List(1, 2, 4, 2, 1, 2)) == 2)
  }

}
