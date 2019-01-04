object P31 {
  private[this] implicit class PrimeNumber(self: Int) {
    def isPrime(): Boolean = {
      if (self <= 1) return false

      def isPrimeR(n: Int): Boolean = {
        if (n == 1) true
        else if (self%n == 0) false
        else isPrimeR(n-1)
      }
      isPrimeR(self-1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(7.isPrime())
  }
}
