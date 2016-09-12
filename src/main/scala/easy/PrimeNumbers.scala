package easy

/**
  * Created by rumata on 08.12.15.
  */
object PrimeNumbers {


  def primes(n: Int): Set[Int] = {
    def getDivisors(n: Int) = (2 to (n - 1)).filter(n % _ == 0)
    if (n < 2) Set()
    else {
      (n to 2 by -1).map { i => if (getDivisors(i).isEmpty) Some(i) else None }.toSet.flatten
    }
  }

}
