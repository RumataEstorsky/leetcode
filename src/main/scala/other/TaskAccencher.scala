package other

/**
  * Created by rumata on 10.04.16.
  */
object TaskAccencher {

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
}
