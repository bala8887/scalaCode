object FruitFall {
  def compute (ap: Int, or: Int, s:Int, t:Int, apple : Array[Int], orange : Array[Int]) = {
    val ap_cnt1 = apple.count(_ + ap >= s) // + 5 >=7
    val ap_cnt2 = apple.count(_ + ap < t) //
    println(ap_cnt1)
    println(ap_cnt2)
    println(s"Apples = ${(ap_cnt1 - ap_cnt2).abs}")
    val or_cnt1 = orange.count(_ + or > s)
    val or_cnt2 = orange.count(_ + or < t)
    println(s"Orange = ${(or_cnt1 - or_cnt2).abs}")
  }
}

def func3(s:Int,t:Int,a:Int,b:Int,ap:List[Int],or:List[Int])={
  val updated_ap=ap.map(i=>i+a)
  val updated_or=or.map(i=>i+b)
  val ap_cnt=updated_ap.count(i=>(i>=s && i<=t))
  val or_cnt=updated_or.count(i=>(i>=s && i<=t))
  println(s"Apples:${ap_cnt}, Oranges:${or_cnt}")
}
func3(7,11,5,15,List(-2,2,1),List(5,-6))