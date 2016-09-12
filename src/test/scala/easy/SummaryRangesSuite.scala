package easy

import easy.SummaryRanges.summaryRanges
import org.scalatest.FunSuite

/**
  * Created by rumata on 9/12/16.
  */
class SummaryRangesSuite extends FunSuite {
  assert(summaryRanges(List(0, 1, 2, 4, 5, 7)) == List("0->2", "4->5", "7"))
  assert(summaryRanges(List(1, 2, 3, 5, 6, 7, 8)) == List("1->3", "5->8"))
}
