object MapUpdate {
  def update {

    val lst = List("Apple", "Orange", "Melon", "Banana", "GRapes")

    var m : scala.collection.mutable.Map[Int, String] = scala.collection.mutable.Map()

    val tpl = lst.zipWithIndex

    for ((k, v) <- tpl) {
      m += (v -> k)
    }

    val n=2
    for ((k, v) <- m) {
      var sz = m(k).size
      m(k) = m(k).slice(0, n) + m(k).slice(n+1, sz)
    }
  }
}

//Other Functions to note down
//m.get(0) -> Some(Orange)
//m.get(7) -> None
//m.getOrElse(7, -5) -> Any = -5
//m.count(a => true) -> 7
//m.count(a => false) -> 0

/*def func():Int={
  h.size-3
}
println(h.contains(func))
println(h.count((k)=>k._1<1))
println(h.getOrElse(6,"Chumma"))*/
