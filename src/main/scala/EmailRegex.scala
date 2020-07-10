object EmailRegex {
  val pattern = "([a-z]+)_([a-z]+)@([a-z]+).([a-z]+)".r
  val email : String = "balachandar_paulraj@icloud.com"

  pattern.findAllIn(email).matchData.foreach(printMsg)

  def printMsg(s : scala.util.matching.Regex.Match) : Unit = {
    println("My first name is " + s.group(1))
    println("My last name is " + s.group(2))
    println("My email domain is "+s.group(3))
  }
}

val re="([a-z0-9]+)@([a-z]+).([a-z]+)".r
val fd=re.findAllIn("teepikamuthu@icloud.com")
println(s"The username is ${fd.group(1)}")
println(s"The domain is ${fd.group(2)}")
println(s"com/in/gov is ${fd.group(3)}")