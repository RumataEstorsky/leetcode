package easy

/**
 * Created by rumata on 8/19/15.
 */
class ContainsDuplicate {

  def containsDuplicate(nums: Iterable[Int]) = nums.groupBy(identity).find(_._2.size > 1).nonEmpty


  def test = {
    assert(containsDuplicate(Array(1,3,4,5,6,7,9,10,10,11)) == true)
    assert(containsDuplicate(Array(1,3,4,5,6,7)) == false)
  }

}
