import scala.annotation.tailrec

//階乗

//「@tailrec」は末尾最適化できない時にコンパイルエラーにする
@tailrec
def factorial(i:Long,acc:Long=1):Long = {
	if( i == 1 )	acc
	else			factorial(i-1,i*acc)
}
/*
val factorial:(Long)=>Long = (i) => {
	if( i == 1 )	1
	else			i * factorial(i-1)
}
*/

println("1!="+factorial(1))
println("2!="+factorial(2))
println("3!="+factorial(3))
println("12!="+factorial(12))
println("15!="+factorial(15))
println("20!="+factorial(20))
