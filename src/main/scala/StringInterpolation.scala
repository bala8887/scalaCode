object StringInterpolation {
  def populate(s : String, indx : Int, elem : String) : Unit = {
    val givenString = s.toList
    val up = s.map(_ .toUpper)
    println(s"String element for index $indx is ${up(indx)}")
    println(s"String index for element $elem is ${up.indexOf(elem)}")
  }
}

StringInterpolation.populate("ribealn", 3, "I")
