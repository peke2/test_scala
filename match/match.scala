
//	マッチング

val str = "2000年11月～2001年3月"

//	StringLikeクラスのメソッド「r」を使うと文字列から正規表現を得られる
val exp = "([0-9]+)年([0-9]+)月～([0-9]+)年([0-9]+)月".r


//	正規表現クラスの説明
//	日時のパースとマッチングについても書かれているので参考になる
//	http://www.scala-lang.org/api/current/#scala.util.matching.Regex

str match{
	case exp(st_y,st_m,ed_y,ed_m) => println(st_y+"/"+st_m+"～"+ed_y+"/"+st_m)
	//case exp(st_y,st_m,ed_y,ed_m) => println(s"$st_y/$st_m～$ed_y/$st_m")
	case _ => println("No match")
}

