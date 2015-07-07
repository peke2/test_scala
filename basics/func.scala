//	関数オブジェクトの確認
val add = (a:Int, b:Int) => a + b
println("add=" + add(3,7))


//	forを使わない場合の繰り返し加算
val sum:(Int) => Int = (a:Int) => if(0==a) 0 else a+sum(a-1)
//val sum = (a:Int) => if(0==a) 0 else a+sum(a-1)		//	再帰の戻り値を使う際に型を明示する必要がある -> どの型が返されるか推論出来ないため
println("sum=" + sum(10))


//	可変引数
def multiArgs(args:String *) = for(arg <- args) println(arg)
//multiArgs(Array("Hello", "world"))	//	配列では渡せない
multiArgs(Array("Hello", "world"):_*)	//	「:_*」で配列の各要素を引数にセット


//	糖衣構文
object Test
{
	var param : Int = _
	def apply(a:Int) : Int = {param = a; a}
}

def test = Test(11)		//applyが呼び出される
println("test="+test)


//	コンパニオンオブジェクト
class TestCompanion private (num:Int)
{
	var param : Int
	def get() : Int = param
}

object TestCompanion
{
	def apply(num:Int)
	{
		new TestCompanion(num)
	}
}

val ins = TestCompanion(31)
println(ins)
