object FoldLeft {
  def concatenate(lst : List[Integer]) : Integer = {
    return lst.foldRight(5)((a, b) => a-b)
  }
}