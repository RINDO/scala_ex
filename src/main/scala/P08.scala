object P08 {

  def compress[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]()) { (acc, x) =>
      if (acc.isEmpty || acc.last != x) acc ++ List(x)
      else acc
    }
  }

  def compress2[A](list: List[A]): List[A] = {
    list.foldRight(List[A]()) { (x, acc) =>
      if (acc.isEmpty || acc.head != x) x :: acc
      else acc
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(compress(list))
    println(compress2(list))
  }
}
