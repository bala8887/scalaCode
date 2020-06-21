object trycatch {
  def main(i:Integer) : Unit = {
  try {
    1/i
  } catch {
    case _ : Throwable => println("exception")
  }
  }
}
