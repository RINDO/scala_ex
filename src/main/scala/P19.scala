object P19 {
  def rotate[A](n: Int, list: List[A]) = {
    val idx = if (n < 0) list.length + n else  n
    val it = list.splitAt(idx)
    it._2 ++ it._1
  }

  def main(args: Array[String]): Unit = {
    val list =  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(rotate(3, list))
    println(rotate(-2, list))
  }
}
