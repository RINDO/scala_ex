object P15 {
  def duplicateN[A](n: Int, list: List[A]): List[A] = list flatMap { it =>
    List.fill(n)(it)
  }

  def main(args: Array[String]): Unit = {
    val list =  List('a, 'b, 'c, 'c, 'd)
    println(duplicateN(3, list))
  }
}
