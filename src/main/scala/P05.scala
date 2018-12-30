object P05 {
  def reverse[A](list: List[A]): List[A] = list.reverse

  def reverseRecursive[A](list: List[A]): List[A] = list match {
    case tail::Nil => List(tail)
    case x::xs => reverseRecursive(xs) ++ List(x)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(reverse(list))
    print(reverseRecursive(list))
  }
}
