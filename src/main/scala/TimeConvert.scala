object TimeConvert {
  def amToPM(tm : String): Unit = {
    val hour = tm.split(":")(0).toInt
    if (tm.contains("PM") && (hour != 12)) {
      println((hour+12) + ":" + tm.slice(3, tm.size-2))
    } else if (tm.contains("PM") && (hour == 12)) {
      println((hour-12) + ":" + tm.slice(3, tm.size-2))
    } else {
      println(tm)
    }
  }
}

TimeConvert.amToPM("12:04:00PM")

/*val x:String="12:25:02PM"
val reg="([0-9]+):([0-9]+:[0-9]+)([PM]+|[AM]+)".r
val n = if (reg.findAllIn(x).group(3)=="PM" & reg.findAllIn(x).group(1)=="12") "00"
        else if (reg.findAllIn(x).group(3)=="PM") reg.findAllIn(x).group(1).toInt+12
        else reg.findAllIn(x).group(1)
println(n+":"+reg.findAllIn(x).group(2)+reg.findAllIn(x).group(3))*/