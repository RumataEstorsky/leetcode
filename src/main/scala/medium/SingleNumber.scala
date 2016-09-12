package medium

/**
 * Created by rumata on 8/7/15.
 */
object SingleNumber {

  def singleNumber(nums: List[Int]) = nums.groupBy(identity).find(_._2.size == 1).get._1 //OrElse(_, -1 -> 1)

  def singleNumberWihoutExtrtaMemory(nums: List[Int]) = nums.foldLeft(0)(_ ^ _)

}
