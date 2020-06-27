object palindrome {
  def palindromeFunction(input : String) : Unit  = {
    var j = 0
    val len = input.length -1
    for (i <- input.indices) {
      if (input(i) != input(len - i)) {
        j=1
      }
    }
    if (j=1) println("not") else println("pal")
  }
}

//need to explore about break statement
//need to explore for reducing the for loop by half times