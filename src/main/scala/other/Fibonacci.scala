package other

/**
 * Created by rumata on 8/19/15.
 */
object Fibonacci {

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


}
