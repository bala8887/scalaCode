object MultiDim {
  def populateArray(rows : Int, cols: Int) : Array[Array[Int]]= {
    val arry = Array.ofDim[Int](rows, cols)
    for {r <- 0 until rows
         c <- 0 until cols} {
        arry(r)(c) = (c * 10) + (r+1)
        println(arry(r)(c))
    }
    arry
  }
}

//Note:
//Array[Array[Int]] needs to be used for returning multi dimensional array
//Array.ofDim[Int] should be checked again for the syntax