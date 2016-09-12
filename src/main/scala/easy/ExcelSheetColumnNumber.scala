package easy

/**
 * Created by rumata on 8/7/15.
 */
object ExcelSheetColumnNumber {

  def titleToNumber(s: String) = {
    def letterToCode(ch: Char) = ch - 'A' + 1

    if(s.length == 1) letterToCode(s.toCharArray.head)
    else 26 * letterToCode(s.toCharArray.head) + letterToCode(s.toCharArray.last)
  }

}
