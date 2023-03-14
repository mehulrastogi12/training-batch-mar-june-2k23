object Assignment1 {

  def main(args: Array[String]) ={
    var count=0
    var n= scala.io.StdIn.readLine()
    var size=n.toInt
    var z: Array[Int] = new Array[Int](size)
    for( a <- 0 to (size-1))
    { var b = scala.io.StdIn.readLine()
      //print(b)
      z(a)=b.toInt
    }

    for( a <- 0 to (size -1))
    {
      var int_square_root=scala.math.sqrt(z(a))
      if((int_square_root*int_square_root)==z(a))
      {
        count=count+1
      }
    }
    println(count)
  }



}
