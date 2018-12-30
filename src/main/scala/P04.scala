object P04 {

  def length[A](list: List[A]): Int = list.length

  def lengthRecursive[A](list: List[A]): Int = list match {
    case Nil   => 0
    case _::xs => 1 + lengthRecursive(xs)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(length(list))
    println(lengthRecursive(list))
  }

}
