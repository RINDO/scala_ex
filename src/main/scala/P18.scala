object P18 {
  def slice[A](from: Int, until: Int, list: List[A]): List[A] = list.slice(from, until)

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(slice(3, 7, list))
  }
}
