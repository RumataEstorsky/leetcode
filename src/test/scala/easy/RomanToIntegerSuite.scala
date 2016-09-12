package easy

import org.scalatest.FunSuite
import easy.RomanToInteger.romanToInt3
/**
  * Created by rumata on 9/12/16.
  */
class RomanToIntegerSuite extends FunSuite {

    assert(romanToInt3("V") == 5)
    assert(romanToInt3("XIII") == 13)
    assert(romanToInt3("CCVII") == 207)
    assert(romanToInt3("MLXVI") == 1066)
    assert(romanToInt3("MCMIV") == 1904)
    assert(romanToInt3("MCMLIV") == 1954)
    assert(romanToInt3("MMXIV") == 2014) // Olympic Games in Sochi
    //println(romanToInt3("MMXIV"))

}
