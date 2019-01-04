import P26.combinations

object P27 {

  // (a

  def group3[A](list: List[A]): List[List[List[A]]] = {
    for {
      a <- combinations(2, list)
      b <- combinations(3, list diff a)
      c <- combinations(4, list diff b)
    } yield List(a, b, c)
  }.toList

  // (b

  def group[A](n: List[Int], ls: List[A]): List[List[List[A]]] = {
    for {
      a <- combinations(n.head, ls)
      b <- combinations(n(1), ls diff a)
      c <- combinations(n(2), ls diff b)
    } yield List(a, b, c)
  }.toList

  def main(args: Array[String]): Unit = {
    val list = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")

    println("----- P27:a -----")
    group3(list).foreach(println)

    println("----- P27:b -----")
    group(List(2, 2, 5), list).foreach(println)
  }
}
