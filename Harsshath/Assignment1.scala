object Assignment1 extends App{
  println("Size of the Array")
  val n = scala.io.StdIn.readInt()
  var arr = new Array[Int](n)
  println("Elements of the Array")
  var count = 0
  for (i <- 0 to n - 1) {
    val x = scala.io.StdIn.readInt()
    arr(i) = x
    val s = scala.math.sqrt(x)
    if (s == s.toInt) {
      count = count + 1
    }
  }
  println(s"Count: $count")

}
