object P17 {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = list.splitAt(n)

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(split(3, list))
  }
}
