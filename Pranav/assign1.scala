object Assignment1 extends App{
  def countPerfectSquares(arr: Array[Int]): Int = {
    var count = 0
    for (i <- arr) {
      val sqrt = math.sqrt(i)
      if (sqrt == sqrt.toInt) {
        count += 1
      }
    }
    count
  }

  val arr = Array(1, 4, 9, 16, 25, 36, 49)
  val numPerfectSquares = countPerfectSquares(arr)
  println(s"The number of perfect squares in $arr is $numPerfectSquares")
}

