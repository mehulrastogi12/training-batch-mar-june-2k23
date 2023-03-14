object Assignment1 extends App{
  def countPerfectSquares(arr: Array[Int], n: Int): Int = {
    if (n == 0) {
      0
    } else {
      val Count = countPerfectSquares(arr.tail, n - 1)
      val s = scala.math.sqrt(arr.head)
      if (s == s.toInt) {
        Count + 1
      } else {
        Count
      }
    }
  }

  println("Size of the array")
  val n = scala.io.StdIn.readInt()
  val arr = new Array[Int](n)
  println("Elements")
  for (i <- 0 to n - 1) {
    val x = scala.io.StdIn.readInt()
    arr(i) = x
  }
  val Count = countPerfectSquares(arr, n)
  println(s"Count: $Count")

}
