object MapFirstFunc {

  def populate() = {

    val lst = List("Apple", "Orange", "Melon", "Banana", "GRapes")
    val lst1 = (0 to lst.size-1 ).toList

    var m : Map[Int, String] = Map()

    for ((k, v) <- lst.zip(lst1)) {
      m += (v-> k)
    }

    println(s"${m.values.toList.sorted}")

  }
}
