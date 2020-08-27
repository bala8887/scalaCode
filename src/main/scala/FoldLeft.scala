object FoldLeft {
  def concatenate(lst : List[Integer]) : Integer = {
    return lst.foldRight(5)((a, b) => a-b)
  }
}

//other examples
//lst.find(z => z>2) : Option[Int] = Some(3)
//lst.partition(a => a>1) : (List[Int], List[Int]) = (List(2, 3),List(1))
//lst.groupBy(a => a>1) :  scala.collection.immutable.Map[Boolean,List[Int]] = Map(false -> List(2, 3), true -> List(1))

//Tuple implementation
val v=("sdfasd",1,"dsfasdf")
println(v._3)