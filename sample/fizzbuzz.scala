//単純
/*
(1 to 100).foreach{i=>
	if(i % 15 == 0) println("FizzBuzz")
	else if(i % 3 == 0) println("Fizz")
	else if(i % 5 == 0) println("Buzz")
	else println(i)
}
*/
/*
(1 to 100).foreach{i=>
	val fb = (i:Int) => {
		if(i % 15 == 0) "FizzBuzz"
		else if(i % 3 == 0) "Fizz"
		else if(i % 5 == 0) "Buzz"
		else i.toString
	}
	println(fb(i))
}
*/

//matchを使う
println((1 to 100).map(i=>(i%3,i%5) match{
	case(0,0)=>"FizzBuzz"
	case(0,_)=>"Fizz"
	case(_,0)=>"Buzz"
	case _ => i.toString
}).mkString(","))


