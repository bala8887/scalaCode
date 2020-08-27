import


object Triplet {
  def compete(alice : Array[Int], bob : Array[Int]) : Array[Int] = {
    var al, bo = 0

    for ((a, b) <- alice.zip(bob)) {
      if (a>b) {al+=1}; if (b>a) {bo+=1}
    }
    Array(al, bo)
    }
}

//TEEP'S
object HelloWorld {
  def main() : Array[Int] = {
    val a: List[Int] = List(3, 6, 2)
    val b: List[Int] = List(6, 2, 2)
    val c = a.zip(b)
    var d = Array(0, 0)
    for ((k, v) <- c) {
      if(k>v) d(0)=d(0)+1 else if(v>k) d(1)=d(1)+1
      /*if (k > v) {
        d(0) = d(0) + 1
      }
      else {
        d(1) = d(1) + 1
      }*/
    }
    d
  }
}


