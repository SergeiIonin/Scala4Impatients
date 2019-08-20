package sequencingcomp

object OptionDemo extends App {

  sealed trait Maybe[A] {
    def fold[B](empty: B)(full: A=> B): B = this match {
case Full(a) => full(a)
case Empty() => empty
    }
  }
  final case class Full[A](value: A) extends Maybe[A]
  final case class Empty[A]() extends Maybe[A]

  sealed trait Sum[A, B] {
    def fold[C](left: A => C, right: B => C): C =
      this match {
        case Left(a) => left(a)
        case Right(b) => right(b)
      }
  }
  final case class Left[A, B](value: A) extends Sum[A, B]
  final case class Right[A, B](value: B) extends Sum[A, B]

}
