object P07 {

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case head:List[_] => flatten(head)
    case e => List(e)
  }

  def main(args: Array[String]): Unit = {
    val nested = List(List(1, 1), 2, List(3, List(5, 8)))
    println(flatten(nested))
  }
}
