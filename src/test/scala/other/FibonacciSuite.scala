package other

import org.scalatest.FunSuite
import other.Fibonacci.{fib, fibNR}

/**
  * Created by rumata on 9/12/16.
  */
class FibonacciSuite extends FunSuite {

  test("fibonacci should be fibonacci)))") {
    assert(fib(5) == 8)
    assert(fib(8) == 34)
    assert(fib(20) == 10946)
    assert(fib(30) == 1346269)

    assert(fibNR(5) == 8)
    assert(fibNR(8) == 34)
    assert(fibNR(20) == 10946)
    assert(fibNR(30) == 1346269)
    assert(fibNR(40) == 165580141)
    assert(fibNR(50) == 20365011074L)
  }

}
