package easy

/**
 * Created by rumata on 8/7/15.
 */
class ExcelSheetColumnNumber {



  def titleToNumber(s: String) = {
    def letterToCode(ch: Char) = ch - 'A' + 1

    if(s.length == 1) letterToCode(s.toCharArray.head)
    else 26 * letterToCode(s.toCharArray.head) + letterToCode(s.toCharArray.last)
  }

  def test = {
    assert(titleToNumber("A") == 1)
    assert(titleToNumber("C") == 3)
    assert(titleToNumber("Z") == 26)
    assert(titleToNumber("AA") == 27)
    assert(titleToNumber("AB") == 28)
    assert(titleToNumber("BB") == 54)
  }

}
