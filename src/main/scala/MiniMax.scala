object MiniMax {
	def computeSum(a : Array[Int]): Unit = {
		println(s"Maximum sum=${a.sum - a.min}")
		println(s"Minimum sum=${a.sum - a.max}")
	}
}

val ar = Array(1, 3, 4, 6, 8, 9, 5, 56, 67)
MiniMax.computeSum(ar)

/*val a=List(0,-1,-2,4,3,5)
val s=a.size
println(a.sorted.slice(0,s-1).sum)
println(a.sorted.slice(1,s).sum)*/