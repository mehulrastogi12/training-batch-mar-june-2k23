object factorial extends App{
  def factorial(input: Int): Int = {
    val res :Int= if(input>1)  input*factorial(input-1) else 1
    res
  }
  println(factorial(5))

}
