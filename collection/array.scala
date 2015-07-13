import scala.collection.mutable._

//

val buff = new ArrayBuffer[Int]()

buff += 5
buff += 4
buff += 2
buff += 3
buff += 1

/*
val comp:(a:Int,b:Int) => Boolean = {
	a > b
}
*/

println("---- before sort ----")
println(buff)

val sorted = buff.sortWith(_<_)

println("---- sorted ----")
println(sorted)

var count = 0
(0 until buff.length).foreach{i=>
	println(buff.apply(i)+"<->"+sorted.apply(i))
	if( buff(i) != sorted(i) )	count += 1
}

println("swap count="+count)
