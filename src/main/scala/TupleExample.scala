object TupleExample {
  def populateTuple(lines : Integer , cols : Integer) = {
    for (i <- 1 to lines) {
      //for (j <- 1 to cols) {
      println("Input for " + i + " and cols 1")
      var first = readLine()
      println("Input for " + i + " and cols 2")
      var second = readLine()
      println("Input for " + i + " and cols 3")
      var third = readLine()
      val t = (first, second, third, if (third.toInt % 2 == 0) true else false)
      println(t)
      //}
    }
  }

}

// if (third.toInt % 2 == 0) true else false should be written as third.toInt % 2 == 0
// need to avoid these type of mistakes
// below statement can be used to match datatype like Tuple or list
// m match {
//     | case (i, j) => (1,2,3,4)
//     | case _ => (1)
//     | }

// need to implement in foreach instead of for loop wherever applicable