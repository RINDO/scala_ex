object P09 {
  def pack[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) {
      List()
    } else {
      val (packed, next) = list.span { _ == list.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(pack(list))
  }
}
