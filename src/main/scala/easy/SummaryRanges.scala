package easy

import scala.collection.mutable.ArrayBuffer

/**
 * Created by rumata on 8/14/15.
 */
class SummaryRanges {

  def summaryRanges(nums: Iterable[Int]) = {
    def makeRangeString(start: Int, end: Int) = if(start == end) start.toString else s"$start->$end"
    var start = nums.head
    var prev = nums.head
    val result = new ArrayBuffer[String]
    for(e <- nums.tail) {
      if((prev + 1) != e) {
        result += makeRangeString(start, prev)
        start = e
      }
      prev = e
    }
    result += makeRangeString(start, nums.last)

    result.toList
  }

  def test = {
    assert(summaryRanges(List(0, 1, 2, 4, 5, 7)) == List("0->2", "4->5", "7"))
    assert(summaryRanges(List(1, 2, 3, 5, 6, 7, 8)) == List("1->3", "5->8"))
  }

}
