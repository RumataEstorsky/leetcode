package easy

import easy.PascalsTriangle.formatTriangle
import org.scalatest.FunSpec

/**
  * Created by rumata on 9/12/16.
  */
class PascalTriangleSuite extends FunSpec {
  val tr5 = List(
    List(1),
    List(1, 1),
    List(1, 2, 1),
    List(1, 3, 3, 1),
    List(1, 4, 6, 4, 1)
  )

  val expect =
"""    1
  |   1 1
  |  1 2 1
  | 1 3 3 1
  |1 4 6 4 1""".stripMargin

  assert(formatTriangle(tr5) == expect)

}
