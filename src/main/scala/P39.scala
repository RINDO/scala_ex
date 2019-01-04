object P39 {
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

  def listPrimeinRange(range: Range): List[Int] =
    Stream.from(range.start).filter(_.isPrime()).takeWhile(_ <= range.end).toList

  def main(args: Array[String]): Unit = {
    println(listPrimeinRange(7 to 31))
  }
}
