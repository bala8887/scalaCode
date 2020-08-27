object Candle {
  def blowCount(ar : Array[Int]) : Unit = {
    println(s"${ar.count(_ == ar.max)}")
  }
}

Candle.blowCount(Array(1, 4, 5, 6, 7, 2, 4, 6, 7))