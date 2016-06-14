package medium

/**
 * Created by rumata on 8/7/15.
 */
class SingleNumber {

  def singleNumber(nums: List[Int]) = nums.groupBy(identity).find(_._2.size == 1).get._1 //OrElse(_, -1 -> 1)

  def singleNumberWihoutExtrtaMemory(nums: List[Int]) = nums.foldLeft(0)(_ ^ _)

  def test = {
    assert(singleNumber(List(1,3,5,6,3,5,1)) == 6)
    assert(singleNumber(List(1,1,0)) == 0)
    assert(singleNumber(List(0,0,4)) == 4)
  }

}
