object P10 {
  def encode[A](list: List[A]): List[(Int, A)] = {
    P09.pack(list).map { it => (it.length, it.head) }
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(list))
  }
}
