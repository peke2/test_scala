
//ループ

println("---- for ----")
println("---- 0 until 4 ----")
for(i <- 0 until 4)	println(i)			//	0～3

println("---- 0 to 4 ----")
for(i <- 0 to 4)	println(i)			//	0～4

println("---- foreach ----")
println("---- 0 to 4 ----")
(0 to 4).foreach{case i => println(i)}


