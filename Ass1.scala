object Assignment1 extends App{
  println("Enter Number of Chests: ")
  val NumberOfChests = scala.io.StdIn.readInt();
  println("Enter Space Seperated Value of each chest: ")
  var arr = new Array[Int](NumberOfChests)
  var ans=0
  var s = scala.io.StdIn.readLine()

  var s1 = s.split(" ")
  for(i <- 0 until NumberOfChests)
    {
      arr(i) = s1(i).toInt
      if(Math.sqrt(arr(i))%1 ==0)
        {
          ans=ans+1
        }
    }

  println(s"There are $ans perfect squares")
}
