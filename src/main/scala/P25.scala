object P25 {
  def randomPermute[A](ls: List[A]): List[A] = {
    P23.randomSelect(ls.length, ls)
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    for (_ <- 1 to 10) {
      println(randomPermute(list))
    }
  }
}
