object P12 {
  def decode[A](list: List[A]): List[A] = {
    P10.encode(list).flatMap { it => List.fill(it._1)(it._2)}
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(decode(list))
  }
}
