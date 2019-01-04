import scala.util.Random

object P23 {
  def randomSelect[A](n: Int, ls: List[A]): List[A] = {
    if (n <= 0) Nil
    else {
      val (rest, e) = P20.removeAt(new Random().nextInt(ls.length), ls)
      e :: randomSelect(n-1, rest)
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    for (_ <- 1 to 10) {
      println(randomSelect(3, list))
    }
  }
}
