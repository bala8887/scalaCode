object sortFunctions {
  case class Student(name : String, id : Int)
  val students = Seq(Student("abc", 1), Student("bad", 0))

  students.sortBy(_.id)
  students.sortBy(_.name)
  students.sortBy(_.name(1))
}
