package monads

object Demo extends App {
   //val str = "my str"
  //str.toList.foreach(println(_))
  //str.toList.map(_.toUpper).foreach(print(_))
  //str.toList.ap(_.)
  //Exercises
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, End())))

  // 1) Double all elements
  val listDoubled = list.map(x => x*2)

  // 2) add one to all the elements in the list
  val listPlusOne = list.map(x => x+1)

  println()

}

sealed trait LinkedList[A] {
  def map[B](fn: A => B): LinkedList[B] =
    this match {
      case Pair(hd, tl) => Pair(fn(hd), tl.map(fn))
      case End() => End[B]()
    }
}
case class Pair[A](hd: A, tl: LinkedList[A]) extends LinkedList[A]
case class End[A]() extends LinkedList[A]


sealed trait Maybe[A] {
  def flatMap[B](fn: A => Maybe[B]): Maybe[B] =
    this match {
      case Full(v) => fn(v)
      case Empty() => Empty[B]()
    }
  def map[B](fn: A => B): Maybe[B] = {
    this match {
      case Full(v) => Full(fn(v))
      case Empty() => Empty[B]()
    }
  }
  def mapAsFlatMap[B](fn: A => B): Maybe[B] = {
    flatMap[B](v => Full(fn(v)))
  }
}
final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]