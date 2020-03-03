var variable = scala.collection.mutable.HashMap("a" -> 1, "b" -> 2)
val immutMap = Map("a" -> 1, "b" -> 2)

val x = immutMap

println(s"value of x before is $x")

variable += "c" -> 3
immutMap + "c" -> 3

println(s"value of x after is $x")
println(s"value of immutMap after is $immutMap")


var variableInt = 1.0

val y = variableInt

println(s"value of y before is $y")

variableInt = 2.0

println(s"value of y after is $y")
println(s"value of variableInt after is $variableInt")
