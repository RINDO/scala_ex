object P28 {

  // (a

  def lsort[A](ls: List[List[A]]): List[List[A]] = ls.sortBy(_.length)

  // (b

  def lsortFreq[A](ls: List[List[A]]): List[List[A]] = {
    def freq(n: Int): Int = ls.count(_.length == n)
    ls.sortWith { (a, b) => freq(a.length) < freq(b.length) }
  }

  def main(args: Array[String]): Unit = {
    val list = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))

    println("----- P28:a ----- ")
    println(lsort(list))
    println("----- P28:b ----- ")
    println(lsortFreq(list))
  }
}
