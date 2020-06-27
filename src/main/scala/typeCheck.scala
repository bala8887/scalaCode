object typeCheck {
  def getType(i : Any) : Unit = {
    i match {
      case l : List[Any] => println("list")
      case s : String => println("string")
      case i : Integer => println("Integer")
      case _ => println("Any other type")
    }
  }
}

//List[Any] can also be given as List[_]
