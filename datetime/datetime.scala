import java.text.SimpleDateFormat

//	日時を扱う

//	フォーマットを指定
val df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

//	文字列からDateFormat型に変換
val dateFormat = df.parse("2015-08-17 15:40:00")
println(dateFormat)

//	DateFormat型から文字列に変換
println( df.format(dateFormat) )

