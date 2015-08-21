
//	マッチング

println("---- 日付文字列のマッチング確認 ----")

val strList = List(
	"2000年11月～2001年3月",
	"2013/2/21 ～",
	"2013/2/21 ～2015/8/9"
)

//	StringLikeクラスのメソッド「r」を使うと文字列から正規表現を得られる
val exp = "([0-9]+)年([0-9]+)月～([0-9]+)年([0-9]+)月".r
//val exp2 = "([0-9]+)/([0-9]+)/([0-9]+)[~～]?(([0-9]+)/([0-9]+)/([0-9]+))?".r
val exp2 = "([0-9]+)/([0-9]+)/([0-9]+)～([0-9]+)/([0-9]+)/([0-9]+)".r
val exp3 = "([0-9]+)/([0-9]+)/([0-9]+)[~～]?".r


//	正規表現クラスの説明
//	日時のパースとマッチングについても書かれているので参考になる
//	http://www.scala-lang.org/api/current/#scala.util.matching.Regex

for(str <- strList)
{
	str.replaceAll("[ 　]","") match{
		case exp(st_y,st_m,ed_y,ed_m) => println(s"exp=$st_y/$st_m～$ed_y/$ed_m")
		//case exp(st_y,st_m,ed_y,ed_m) => println(s"$st_y/$st_m～$ed_y/$st_m")
		case exp2(st_y,st_m,st_d,ed_y,ed_m,ed_d) => println(s"exp2=$st_y/$st_m～$ed_y/$ed_m")
		case exp3(st_y,st_m,st_d) => println(s"exp3=$st_y/$st_m～$st_y/$st_m")
		case s => println(s"[$s] is No match")
	}
}

println("")
println("---- どこが取得されるかの確認 ----")

val no_brackets = """\d\d\d\d-\d\d-\d\d""".r
val with_brackets = """(\d\d\d\d)-(\d\d)-(\d\d)""".r	//「()」で囲まれた範囲を取得
val date = "1785-02-05"

date match{
	case no_brackets(y,m,d) => println("No brackets=> "+s"$y/$m/$d")
	case with_brackets(y,m,d) => println("With brackets=> "+s"$y/$m/$d")
	case s => println(s"[$s] is No match")
}

println("")
println("---- どこが取得されるかの確認(日付じゃないやつ) ----")

val start = "^(http:).*".r
val target = "http://www.google.com/"

target match{
	case start(protcol) => println("protcol=> "+s"$protcol")
	case s => println(s"[$s] is No match")
}


