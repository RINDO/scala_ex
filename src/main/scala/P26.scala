object P26 {
  def combinations[A](n: Int, ls: List[A]): Iterator[List[A]] = ls.combinations(n)

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    combinations(3, list).foreach(println)
  }
}
