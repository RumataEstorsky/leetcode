package easy

import org.scalatest.FunSuite
import easy.PrimeNumbers.primes

/**
  * Created by rumata on 9/12/16.
  */
class PrimeNumbersSuite extends FunSuite {

    assert(primes(1) == Set())
    //    assert(primes(-1) == Set(1))
    assert(primes(10) == Set(2, 3, 5, 7))
    //println(primes(100).toSeq.sortWith(_ < _))
}
