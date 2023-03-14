import scala.math._
object HelloWorld {
  
  def helper(x:Int):Boolean={
    
    val temp=sqrt(x);
    return (temp*temp==x)
   return false;
  }
  
  
	def main(args: Array[String]): Unit = {
	
	println("Enter the size of array->");
	var n = scala.io.StdIn.readInt();
    var no=new Array[Int](n);

    println("Enter the array->");

    for(i<-0 to n-1){
        val x=scala.io.StdIn.readInt();
        no(i)=x;
        }
	
	var count=0;
	for( i<- no)
	{
	if(helper(i)==true)
	count=count+1;
	}
	println("total no of perfect sqaures are->")
	println(count);

	}
}