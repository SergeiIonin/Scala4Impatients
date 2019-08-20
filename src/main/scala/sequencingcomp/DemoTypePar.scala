package sequencingcomp

object DemoTypePar extends App {
  sealed trait LinkedList[A] { // this is the typed ADT
    def length(): Int = this match { // don't forget 'this match'
      case End() => 0
      case Pair(_, t) => 1 + t.length()
    }
    def contains(x: A): Boolean = this match { // don't forget 'this match'
      case End() => false
      case Pair(h, t) => if (h==x) true else t.contains(x)
    }
    def apply(n: Int): Result[A] = this match {
      case End() => Failure[A]("Out of bounds")
      case Pair(h,t) => if (n == 0) Success(h) else t.apply(n-1)
    }
  }

  final case class End[A]() extends LinkedList[A]
  final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A] // don't forget to specify [A] in the
  // class definition

  // below is the ADT for dealing for wrapping of successfull and faulty outputs
  sealed trait Result[A]
  case class Success[A](result: A) extends Result[A]
  case class Failure[A](reason: String) extends Result[A]

  println("===length===")
  val example1 = Pair(1, Pair(2, Pair(3, End())))
  println(example1.length == 3)
  println(example1.tail.length == 2)
  println(End().length == 0)

  println("===contains===")
  val example2 = Pair(1, Pair(2, Pair(3, End())))
  println(example2.contains(3) == true)
  println(example2.contains(4) == false)
  println(End().contains(0) == false)

  println("===apply===")
  println(example2(0) == Success(1))
  println(example2(1) == Success(2))
  println(example2(2) == Success(3))
  println(example2(3) == Failure("Out of bounds"))

}
