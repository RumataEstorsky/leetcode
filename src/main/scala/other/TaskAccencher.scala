package other

/**
 * Created by rumata on 10.04.16.
 */
class TaskAccencher {

  def recursiveFlatten(b: List[AnyRef]): List[String] =
    b.foldLeft(List[String]())((acc, el) => el match {
      case null => acc
      case s: String => acc :+ s
      case lst: List[AnyRef] => acc ++ recursiveFlatten(lst)
    })

  def g(h: List[String]) =
    h.foldLeft(List[String]())((acc, el) => acc.lastOption match {
      case Some(`el`) => acc
      case _ => acc :+ el
    })

  def test = {
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

}
