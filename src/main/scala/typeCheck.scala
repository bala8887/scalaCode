object typeCheck {
  def getType(i : Any) : Unit = {
    i match {
      case l : List[String] => println("list")
      case s : String => println("string")
      case i : Integer => println("Integer")
      case _ => println("Any other type")
    }
  }
}
