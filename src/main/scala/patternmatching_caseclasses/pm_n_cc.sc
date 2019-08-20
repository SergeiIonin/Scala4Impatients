//val digit = Character.digit('v', 10)


// reg exp will be an extractor
val pattern = "([0-9]+) ([a-z]+)".r
val res = "99 bottles" match {
  case pattern(num, item) => "it is!"
  case _ => "nope"
  // Sets num to "99", item to "bottles"
}

val (q, r) = BigInt(10) /% 3


val arr = "pat mat is cool".split(" ").toArray
val Array(first, second, rest @ _*) = arr

//=========
/*val x = 4

val 2 = x*/

//===========
val str1 = arr.foldRight("")(_+" "+_).trim

val map1 = arr.groupBy(_.charAt(0))
val map2 = arr.map(_.charAt(0)) zip arr

/*
for ((k, v) <- System.getProperties())
  println(s"$k -> $v")*/

abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

val amt = Currency(29.95, "EUR")
val price = amt.copy(value = 19.95)

//============
//nested structures
/*abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

val it = Bundle("Father's day special", 20.0,
  Article("Scala for the Impatient", 39.95),
  Bundle("Anchor Distillery Sampler", 10.0,
    Article("Old Potrero Straight Rye Whiskey", 79.95),
    Article("Junípero Gin", 32.95)))

def price(it: Item): Double = it match {
  case Article(_, p) => p
  case Bundle(_, disc, its @ _*) => its match  {
    case article:Article => article.map(_=> _.price).sum - disc
}
}

def price1(it: Item): Double = it match {
  case Article(_, p) => p
  case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
}*/

val scores: Map[String, Int] = Map("Alice"->5564, "Bob" -> 322523)
println(scores.getOrElse("Alice", None))

//==================
// partial functions
"-3+4".map { case '+' => 1 ; case '-' => -1; case _ => 0 }

val names = Array("Alice", "Bob", "Carmen")
val scores2 = Map("Alice" -> 10, "Carmen" -> 7)
names.collect(scores2)