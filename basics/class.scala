//	クラスの確認

class TestClass(a:Int, b:String)
{
	//デフォルトコンストラクタの処理は直接クラス内に記述(インスタンス化されたタイミングで処理される)
	val	inner_a = a
	val	inner_b = b

	//補助コンストラクタ
	def this()
	{
		this(31, "default")
	}

}


val tc = new TestClass(19, "Hello")

println("Default constructor")
println("a->"+tc.inner_a)
println("b->"+tc.inner_b)

val tc2 = new TestClass()

println("Sub constructor")
println("a->"+tc2.inner_a)
println("b->"+tc2.inner_b)

