object Staircase {
	def printIt (n : Int) = {
	for (i <- 0 until n) { println(" "*{n-i-1} + "#"*{i+1}) }
	}
}

//TEEP'S
/*def func3(a:Int)={
	for {i<- 1 to a} println(" "*(a-i)+"#"*i)
}*/
//func3(4)