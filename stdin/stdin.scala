//標準入力の確認


import	scala.io.Source
import	scala.collection.mutable.ArrayBuffer

def	resolve(buff:ArrayBuffer[String]) : String =
{
	def	conv(n:Int):Char = {
		((n - 3) / 2).toChar
	}

	var	text = ""

	for(str <- buff)
	{
		text += conv(str.toInt)
	}

	return	text
}


var	std = Source.stdin
var	i = 0
var	arr = new ArrayBuffer[String]()

try
{
	for(line <- std.getLines)
	{
		//println("["+i+"]="+line)

		var	sb = new StringBuilder(line)
		var	strs = sb.split(' ')
		arr.appendAll(strs)
		/*
		for(s <- strs)
		{
			println("    ["+i+"]="+s)
		}
		*/

		i += 1
	}
}
finally
{
	std.close
}
/*
for(a <- arr)
{
	println(a)
}
*/

var	text:String = resolve(arr)
println(text)


/*
var	arr_a = Array(1, 2, 3)
var	arr_b = Array(4, 5, 6)
var	arr_c = arr_a ++ arr_b

for(c <- arr_c)	println(c)
*/

/*
import scala.io.StdIn

var	i = 0
var	line = null

while( (line = StdIn.readLine) != null )
{
	println("["+i+"]="+line)
	i += 1
}
*/
