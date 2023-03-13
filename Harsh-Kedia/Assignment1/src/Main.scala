object Main {
  def calculatepersquares(arr: Array[Int]): Int = {
    var count = 0
    for (i <- 0 until arr.length) {
      val result = arr(i)
      val root = math.sqrt(result)
      if (root.toInt * root.toInt == result) {
        count += 1
      }
    }
    count
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 4, 7, 9, 16, 25, 36, 49)
    println(calculatepersquares(arr))
  }
}
