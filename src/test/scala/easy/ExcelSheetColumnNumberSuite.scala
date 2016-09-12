package easy

import easy.ExcelSheetColumnNumber.titleToNumber
import org.scalatest.FunSuite

/**
  * Created by rumata on 9/12/16.
  */
class ExcelSheetColumnNumberSuite extends FunSuite {

  assert(titleToNumber("A") == 1)
  assert(titleToNumber("C") == 3)
  assert(titleToNumber("Z") == 26)
  assert(titleToNumber("AA") == 27)
  assert(titleToNumber("AB") == 28)
  assert(titleToNumber("BB") == 54)
}
