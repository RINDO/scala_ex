import scala.util.Random

object P24 {
  def lotto(n: Int, max: Int): List[Int] = {
    def lottoR(m: Int, ls: List[Int]): List[Int] = {
      if (m == 0) ls
      else {
        val r = new Random()
        lottoR(m-1, r.nextInt(max) :: ls)
      }
    }
    lottoR(n, Nil)
  }

  def lotto2(n: Int, max: Int): List[Int] = {
    P23.randomSelect(n, List.range(1, max+1))
  }

  def main(args: Array[String]): Unit = {
    println(lotto(6, 49))
    println(lotto2(6, 49))
  }
}
