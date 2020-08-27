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

//Another implementation
val m:List[String]=List("Orange","Apple","WaterMElon","Grapes","Kuta")
val a=m.zipWithIndex
val b=a.map((k)=>(k._2,k._1))
println(b.sortBy(h=>h._2.size))
