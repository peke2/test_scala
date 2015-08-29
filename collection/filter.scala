
def filterMatchMulti()={
	val a = List(1,2,3,4,5)
	val remove = List(3,5)
	//	除去要素に含まれないものを抽出
	val b = a.filterNot(remove contains _)

	println(a)
	println(b)
}

filterMatchMulti
