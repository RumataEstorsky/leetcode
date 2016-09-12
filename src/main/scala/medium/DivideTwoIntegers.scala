package medium

//
// TODO tests!!!
//
object DivideTwoIntegers {

  def divide(dividend: Int, divisor: Int) =
    if(divisor == 0) Integer.MAX_VALUE
    else if(dividend == 0) 0
    else {
      var result = 0
      val negative = math.signum(dividend) != math.signum(divisor)
      val workDivisor = math.abs(divisor)
      var minuend = math.abs(dividend)

      while(minuend >= workDivisor ) {
        result = result + 1
        minuend = minuend - workDivisor
      }

      if(negative) -result else result
  }
}
