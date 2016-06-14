package other

/**
 * Created by rumata on 8/19/15.
 */
class Fibonacci {

  def fib(n: Int): Long =
    if(n <= 1) 1
    else fib(n - 1) + fib(n - 2)

  // non-recursive version
  def fibNR(n: Int): Long = {
    var prev = 1L
    var curr = 1L
    for(i <- (1 until n)) {
      val buff = curr
      curr = prev + curr
      prev = buff
    }
    curr
  }



  def test = {
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
