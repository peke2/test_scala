
val list = Map(1->"a", 2->"b", 3->"c")

list.foreach{key_value=>
	//	タプルをマッチングして値を取り出す
	val (key, value) = key_value
	println(key+ "->" + value)

	//	タプルをそのまま参照
	println(key_value._1+"->"+key_value._2)
}

