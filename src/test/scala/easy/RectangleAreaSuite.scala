package easy

import easy.RectangleArea.{computeArea, distance}
import org.scalatest.FunSuite

/**
  * Created by rumata on 9/12/16.
  */
class RectangleAreaSuite extends FunSuite {

  assert(distance(0, 6) == 6)
  assert(distance(-3, 3) == 6)
  assert(computeArea(-3, 0, 3, 4, 0, -1, 9, 2) == 45)
}
