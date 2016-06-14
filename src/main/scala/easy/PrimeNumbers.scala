package easy

/**
 * Created by rumata on 08.12.15.
 */
class PrimeNumbers {


  def primes(n: Int): Set[Int] = {
    def getDivisors(n: Int) = (2 to (n - 1)).filter(n % _ == 0)
    if(n < 2) { Set() }
    else {
      (n to 2 by -1).map { i => if (getDivisors(i).isEmpty) Some(i) else None }.toSet.flatten
    }
  }


  def test() = {
    assert(primes(1) == Set())
//    assert(primes(-1) == Set(1))
    assert(primes(10) == Set(2, 3, 5, 7))
    //println(primes(100).toSeq.sortWith(_ < _))
  }
}
