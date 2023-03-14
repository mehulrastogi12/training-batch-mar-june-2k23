import scala.annotation.tailrec
import scala.io.StdIn.readLine
import scala.math._
object MainClass {

  // tailrec ensures that the recursive function is tail recursive otherwise it will throw an error
  @tailrec
  private def factorial(x: Int, fac:Int): Int = {
    if (x <= 1)
      return fac ;
    factorial(x-1, x * fac) ;
  }

  private def findPerfectSquare(): Unit = {
    print("Enter array Values : ")
    val arr = readLine().split(" ").map(_.toInt)
    var ans: Int = 0 ;
    arr.foreach((a) => {
      val x : Int = sqrt(a).toInt ;
      if(x * x == a) ans+=1 ;
    })
    println(s"Total number of perfect square are: ${ans}") ;
  }

  def main(args: Array[String]): Unit = {
//        findPerfectSquare();
//        println(s"Factorial of 5 is : ${factorial(5, 1)}")  ;
  }
}
