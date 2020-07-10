object CaseStatement {
  def check(i:Int) : Unit = {
    i match {
      case 3  if (i%5 == 0) => println("Odd number divisible by 5")
      case _ => println("Others")
    }
  }
}