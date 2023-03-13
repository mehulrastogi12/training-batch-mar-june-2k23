import scala.math._
object HelloWorld {
  
  def helper(x:Int):Boolean={
    
    var temp=sqrt(x);
    return (temp*temp==x)
   return false;
  }
  
  
	def main(args: Array[String]): Unit = {
	
	
	var no=Array(1,4,7,9,16,25,36,49);
	
	var count=0;
	for( i<- no)
	{
	if(helper(i)==true)
	count=count+1;
	}
	println(count);

	}
}