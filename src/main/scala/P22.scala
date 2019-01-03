object P22 {
  def range(from: Int, to: Int): List[Int] = {
    def rangeR(end: Int, ls: List[Int]): List[Int] = {
      if (from > end) ls
      else rangeR(end-1, end :: ls)
    }
    rangeR(to, Nil)
  }

  def range2(from: Int, to: Int): List[Int] = List.range(from, to+1)

  def main(args: Array[String]): Unit = {
    println(range(4, 9))
    println(range2(4, 9))
  }
}
