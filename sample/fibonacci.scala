import scala.annotation.tailrec

//フィボナッチ

@tailrec
/*
def fib(n:Int):Long = {
	n match{
		case 0 => 0
		case 1 => 1
		case _ => fib(n-2) + fib(n-1)
	}
}
*/
//	末尾再帰(式の変形で出てくるが、こんなの思いつかない)
def fib(n:Int, a:Long=1, b:Long=0):Long = {
	n match{
		case 0 => 0
		case 1 => a
		case _ => fib(n-1, a+b, a)
	}
}


val nums = Array(0,1,2,3,4,5,10,100)
//val nums = Array(0,1,2,3,4,5,10)

for( n <- nums )	println("n="+n+" -> "+fib(n))
