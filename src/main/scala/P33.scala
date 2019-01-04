import P32.gcd

object P33 {
  private[this] implicit class CoprimeNumber(self: Int) {
    def isCoprimeTo(other: Int): Boolean = gcd(self, other) == 1
  }

  def main(args: Array[String]): Unit = {
    println(35.isCoprimeTo(64))
  }
}
