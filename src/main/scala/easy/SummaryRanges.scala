package easy

import scala.collection.mutable.ArrayBuffer

/**
 * Created by rumata on 8/14/15.
 */
object SummaryRanges {

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

}
