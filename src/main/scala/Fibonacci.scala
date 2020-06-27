object Fibonacci {
  def computeFibonacci(n : Integer) : Unit = {

    var a = 0
    var b = 1
    for (i <-  0 to n by 1) {
      if (i == 0) {
        println(i)
      } else if(i==1) {
        println(i)
      } else {
        println(a+b)
        var tmp=b
        b=a+b
        a=tmp
      }
    }
  }
}

//can explore recursive for fibonacci
