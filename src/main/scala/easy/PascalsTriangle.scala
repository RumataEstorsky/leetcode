package easy

// https://leetcode.com/problems/pascals-triangle/
object PascalsTriangle {

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
