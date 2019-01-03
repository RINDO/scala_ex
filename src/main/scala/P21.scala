object P21 {
  def insertAt[A](e: A, n: Int, list: List[A]): List[A] = list.splitAt(n) match {
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (pre, post)       => pre ::: List(e) ::: post
    case (pre, Nil)        => pre ::: List(e)
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd)
    println(insertAt('new, 1, list))
  }
}
