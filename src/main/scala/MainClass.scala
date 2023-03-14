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


  // Time complexity : O(n)
  // space Complexity : O(n) : stack space
  @tailrec
  private  def fibonacci(n: Int, a:Int, b:Int ):Int = {
    if(n==0)
      return b ;
    fibonacci(n-1, b , a+b ) ;
  }
  private def getFibonacciNumber(): Unit = {
    print("Enter the n to get nth fibonacci number : " ) ;
    var n : Int = scala.io.StdIn.readInt()
    if(n == 1) {
      println(s"1st fibonacci number is : 0")
    }
    else if (n== 2){
      println(s"2nd Fibonacci number is : 1");
    }else{
      println(s"${n}th fibonacci number is ${fibonacci(n-2,0,1)}") ;
    }
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
    getFibonacciNumber();
  }
}
