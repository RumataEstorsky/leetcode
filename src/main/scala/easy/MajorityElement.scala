package easy

object MajorityElement {

  def majorityElement(nums: List[Int]) = nums.groupBy(identity).maxBy(_._2.size)._1

}
