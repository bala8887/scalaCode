object PlusMinus {
  def getCount(ar : Array[Int]) : Array[Double]= {
    val sz = ar.size.toDouble
    Array(ar.filter(_ > 0).size / sz, ar.filter(_ < 0).size / sz, ar.filter(_ == 0).size / sz)
  }
}

PlusMinus.getCount(Array(0, 2, 3))