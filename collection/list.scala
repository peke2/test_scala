
//	要素の削除
def remove()={
	val a = List(1,2,3,4,5,6,7)
	val b = a.filter{_ != 5}

	println("---- remove 5 ----")
	println(a)
	println(b)

	println("")
}

//	組み合わせ
def combination()={
	val a = List(1,2,3,4,5)
	val b = a.combinations(3)

	println("---- combinations 3 ----")
	println(a)

	//	イテレータは列挙すると空になる？？？？
	println("first B=>"+b)
	val c = b.toList

	println("before B=>"+b)
	println(b.mkString(","))
	println("after B=>"+b)

	val d = c.filter{_ != List(1,3,5)}

	println(c.mkString(","))

	println(d)

	println("")
}


remove()

combination()
