object P02 {

  def penultimate[A](list: List[A]): A = {
    if (list.size < 1) {
      sys.error("list is Empty!")
    }
    list.init.last
  }

  def penultimateRecursive[A](list: List[A]): A = list match {
    case h::_::Nil => h
    case _::tail   => penultimateRecursive(tail)
    case _         => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(penultimate(list))
    println(penultimateRecursive(list))
  }

}
