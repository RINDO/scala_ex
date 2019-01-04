object P32 {
  def gcd(i: Int, j: Int): Int = {
    if (j == 0) i
    else gcd(j, i%j)
  }

  def main(args: Array[String]): Unit = {
    println(gcd(36, 63))
  }
}
