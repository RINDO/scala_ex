object P03 {
  def nth[A](index: Int, list: List[A]): A = {
    if (list.size-1 < index) {
      throw new IndexOutOfBoundsException
    }
    list(index)
  }

  def nth2[A](index: Int, list: List[A]): A = list match {
    case _ if list.size-1 > index => list(index)
    case _ => throw new IndexOutOfBoundsException
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5 ,8)
    println(nth(2, list))
    println(nth2(2, list))
  }
}
