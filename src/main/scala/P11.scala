object P11 {
  def encodeModified[A](list: List[A]): List[Any] = {
    P10.encode(list).map { it => if (it._1 == 1) it._2 else it }
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encodeModified(list))
  }
}
