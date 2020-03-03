val coll = Seq(1, 1, 2, 3, 5, 8, 13)
coll.toSet
import scala.collection.mutable.ArrayBuffer
//val buf = coll.to[ArrayBuffer]

//Seq(1,2,3) == (1 to 3)

val seq1 = Seq(1,2,3)
val seq2 = Seq(1,2,3)
seq1 == seq2
seq1 sameElements seq2
//Seq(1,2,3) == Seq(1,2,3)

def digits(n: Int): Set[Int] =
  if (n < 0) digits(-n)
  else if (n < 10) Set(n)
  else digits(n / 10) + (n % 10)

digits(15)

def sum(list: List[Int]): Int = {
  if (list != Nil) list.head+sum(list.tail) else 0
}

def sum2(list: List[Int]): Int = list match {
  case Nil => 0
  case x+:xs => x + sum(xs)
}

sum2(List(1,3,5,7))


val seq3 = Seq(1,2,3,-5,-10,6,8)

val seq3N = seq3.toList.takeRight(4)

val seqRes = seq3//.takeWhile(z => z<0)

val seq4 = seq3.map(_*2)

//seq3.collect()

val seqZip = seq3 zip seq4

val words = List("Tangerine", "Apple", "Banana")

val mapWords = words.groupBy(_.charAt(0).toString.toUpperCase())

List(1, 7, 2, 9).foldLeft("")(_ + _)

val freq = scala.collection.mutable.Map[Char, Int]()
for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1
freq

type mutMap = scala.collection.mutable.Map[Char, Int]

val map2 = scala.collection.immutable.Map[Char, Int]()

// this is deprecated
/*(map2 /: "Mississippi") {
  (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
}*/

"Mississippi".foldLeft(map2)((m, c) => m + (c -> (m.getOrElse(c, 0) + 1)))

(1 to 10).scanLeft(0)(_+_)

List(5.0, 20.0, 9.95) zip List(10, 2)

"Scalz".zipWithIndex.max._2

// streams
def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n + 1)
val tenOrMore = numsFrom(10)
tenOrMore.tail.tail.tail
val squares = numsFrom(2).map(x => x*x)
squares.take(5).force
squares.force

// lazy views
/*val palindromicSquares = (1 to 1000000).view
  .map(x => x * x)
  .filter(x => x.toString == x.toString.reverse)
palindromicSquares.take(3).mkString(",")*/

// parallel collections
import scala.collection._

seq4
//for (i <- (0 until 10).par) print(s" $i")
