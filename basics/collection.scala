
//	コレクションの確認

val a = Nil		//	空のリスト
//val a = List("0123")

//val b = a :: "ABC" :: "DEF"
//val b = a :: "ABC"	//	「:」が最後につくメソッドは左右の要素を入れ替える必要がある
val b = "ABC" :: a		//	左右の要素を入れ替え
val c = b.::("DEF")		//	入れ替えない場合の呼び出し方

println(a)
println(b)
println(c)

println("--------")

val d = "abc" :: "def" :: "ghi" :: Nil
println(d)

