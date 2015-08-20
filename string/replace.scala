
val regex = "[ 　]"			//	1文字 -> 1文字に置換
//val regex = "[ 　]+"		//	対象の文字が複数あっても1文字に置換
val str = "A B  CD　EF"

println(str)

println(str.replaceAll(regex, "*"))
println(str.replaceAll(regex, ""))		//	削除
