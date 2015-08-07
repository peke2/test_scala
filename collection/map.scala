
val list = Map(1->"a", 2->"b", 3->"c")

list.foreach{key_value=>
	//	タプルをマッチングして値を取り出す
	val (key, value) = key_value
	println(key+ "->" + value)

	//	タプルをそのまま参照
	println(key_value._1+"->"+key_value._2)
}

println()
println("--------")

//	空のリストを作成
var array_list = Map.empty[String, Array[String]]

array_list = array_list + ("b"-> Array("aaa","bbb","ccc"))
array_list = array_list + ("a"-> Array("ddd","fff","ggg"))
array_list = array_list + ("c"-> Array("iii","hhh","mmm"))

//	そのまま列挙
println("---- enumerate")
for(arr <- array_list){
	val (k, v) = arr
	println("key["+k+"]->"+v.mkString(","))
}


//	キーで要素を取り出す
println("---- enumerate by key")
for(k <- Array("a","b","c")){
	val v = array_list(k)
	println("key["+k+"]->"+v.mkString(","))
}


//	リストをリストに追加登録
println()
println("--------")

val list_map = Map("abc"->List("aaa", "bbb", "ccc"), "def"->List("ddd", "eee", "fff"))
var temp_list:List[List[String]] = List()
for(map <- list_map)
{
	val (k, v) = map
	temp_list = temp_list :+ v
	println(v)
}

println(temp_list)
