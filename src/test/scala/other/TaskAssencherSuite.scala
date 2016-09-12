package other

import org.scalatest.FunSuite
import other.TaskAccencher.recursiveFlatten

/**
  * Created by rumata on 9/12/16.
  */
class TaskAssencherSuite extends FunSuite {

  // First
  val cities = List("New-York", List("Brasilia", "Ottawa"), "Zagreb", null)
  val cities2 = List("Arizona", List("Buckeye", List("Camp Verde")), "California", null)
  //    val oops = List(true, "Hello", List("qqq"), null)
  println(recursiveFlatten(cities))
  println(recursiveFlatten(cities2))
  println(recursiveFlatten(List()))

  // Second
  //val fruits = List("Apple", "Banana", "Peach", "Grape", "Plum")
  //val vegetables = List("Carrot")
  //println(g(List()))
  //println(g(fruits))
  //println(g(vegetables))

}
