object P20 {
  def removeAt[A](n: Int, list: List[A]): (List[A], A) = list.splitAt(n) match {
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (pre, e::post)    => (pre ::: post, e)
    case (_, Nil)          => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd)
    println(removeAt(1, list))
  }
}
