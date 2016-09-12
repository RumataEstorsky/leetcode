package easy

/**
 * Created by rumata on 8/19/15.
 */
object RomanToInteger {

  val roman = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

  def isNeedSubstract(curr: Char, next: Char) = roman(curr) < roman(next)

  def romanToInt(s: String) = {
    var result = 0
    for(i <- (0 until s.size) ) {
      val isSubtract = if(i < s.size - 1) {
        isNeedSubstract(s(i), s(i + 1))
      } else false
      result = if(isSubtract) result - roman(s(i)) else result + roman(s(i))
    }
    result
  }


  def romanToInt2(s: String) = s.foldRight(('I', 0)) { case (curr, (next, acc)) =>
    (curr, if(isNeedSubstract(curr, next)) acc - roman(curr) else acc + roman(curr))
  }._2

  def romanToInt3(s: String) = (s + "I").sliding(2).foldLeft(0){case (acc, e) =>
    if(isNeedSubstract(e.head, e.last)) acc - roman(e.head) else acc + roman(e.head)
  }


}
