object P14 {
  def duplicate[A](list: List[A]): List[A] = list.flatMap { it =>
    List.fill(2)(it)
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'c, 'd)
    println(duplicate(list))
  }
}
