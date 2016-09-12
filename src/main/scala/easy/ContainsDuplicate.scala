package easy

/**
 * Created by rumata on 8/19/15.
 */
object ContainsDuplicate {

  def containsDuplicate(nums: Iterable[Int]) = nums.groupBy(identity).find(_._2.size > 1).nonEmpty


}
