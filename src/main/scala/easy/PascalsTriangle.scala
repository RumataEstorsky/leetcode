package easy

// https://leetcode.com/problems/pascals-triangle/
class PascalsTriangle {

  def generate(numRows: Int) = 1

  def test = {
    val tr5 = List(
      List(1),
      List(1,1),
      List(1,2,1),
      List(1,3,3,1),
      List(1,4,6,4,1)
    )

    println(formatTriangle(tr5))
  }

  def formatTriangle(tr: Iterable[Iterable[Int]]) = {
    val Sep = " "
    val width = tr.last.mkString(Sep).length
    tr.map { line =>
      val l = line.mkString(Sep)
      val spaces = " " * ((width - l.length) / 2)
      spaces + l
    }.mkString("\n")
  }

}
