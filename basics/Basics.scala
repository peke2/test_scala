
object Basics extends App
{
	var	str_sample = new StringSample()
	str_sample.run()

	println("----------------")

	var	calc_sample = new CalcSample()
	calc_sample.run()

	println("----------------")

	var	array_sample = new ArraySample()
	array_sample.run()

	println("----------------")

	var	cb_sample = new ConditionBranchSample()
	cb_sample.run()

	println("----------------")

	var	match_sample = new MatchSample()
	match_sample.run()

	println("----------------")
}


/**
 *	文字列
*/
class StringSample
{
	def run()
	{
		//val	text = 'abcdef'		//「''」は文字リテラル
		val	text = "abcdef"		//「""」は文字列リテラル
		println(text)

		//	「val」はimmutable
		//text = "fijk";
	}
}


/**
 *	計算
*/
class CalcSample
{
	def run()
	{
		var	a:Int = 1
		var	b = 2

		//「++」「--」は存在しない
		//a++

		println("a=" + a)
		println("b=" + b)

		b = b + a + 1

		println("b = b + a + 1 -> " + b)
	}
}


/**
 *	配列
*/
class ArraySample
{
	def run()
	{
		var	test:Array[String] = Array("abc", "defg", "hijk", "lmn")
		println("element 2 -> " + test(2))

		//for( i <- test )
		for( i ← test )		//「<-」でも「←」でもいけるらしい
		{
			println(i)
		}

		println("---- Filter length 3 ----")
		for( i <- test if i.length == 3 )
		{
			println(i)
		}
	}
}


/**
 *	条件分岐
*/
class ConditionBranchSample
{
	def run()
	{
		var	a = 50

		if( 30 <= a && a < 40 )	println("a >= 30, a < 40")
		else					println("a < 30, a >= 40")

	}
}


/**
 *	マッチ
*/
class MatchSample
{
	def run()
	{
	//	var	a = 50			//「Int」固定なので、以下のcase「_」は通らない -> コンパイル時に warning
		var	a:Any = 50

		var result = a match{
			case	b:Int => "Number"
			case	_ => "Not found"
		}

		println(a + " is " + result)

		//	判定は上から順番に行われる
		a = 50
		result = a match{
			case	c:Int if c > 10 => "larger than 10"
			case	c:Int if c == 50 => "equal 50"
			case	_ => "lower equal 10"
		}

		println(a + " is " + result)

		a = "Hello"

		result = a match{
			case	b:Int => "Number"
			case	r:String => "String"
			case	_ => "Not found"
		}

		println(a + " is " + result)

	}
}

