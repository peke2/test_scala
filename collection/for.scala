
//for文を使ってみる

println("-------- 1 to 5")
//1～5
for(i <- 1 to 5){println(i)}
println("-------- 1 until 5")
//1～4
for(i <- 1 until 5){println(i)}
println("-------- 1 to 10 even")
//1～10の間の偶数
for(i <- 1 to 10 if (i&1)==0) println(i)

println("-------- original collection")
//オリジナルのコレクション
def func(n:Int) = 
for{
	i <- 1 to n
	if(i&1)==0
} yield i

for(i <- func(12)) println(i)

