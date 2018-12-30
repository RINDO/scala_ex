object P01 {

  def last[A](list: List[A]): A = list.last

  def lastRecursive[A](list: List[A]): A = list match {
    case h::Nil  => h
    case _::tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    val e = last(list)
    val e2 = lastRecursive(list)

    println(e)
    println(e2)
  }

}
