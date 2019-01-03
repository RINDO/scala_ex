object P16 {
  def dropRecursive[A](n: Int, ls: List[A]): List[A] = {
    ls.zipWithIndex.filter { it => (it._2 + 1) % n != 0 }.map { _._1 }
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(dropRecursive(3, list))
  }
}
