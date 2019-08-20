package sequencingcomp

object DemoFunc extends App {
  sealed trait IntList {
    def length: Int = fold(0)((_,x) => x+1)

    def double: IntList = fold[IntList](End)((h,t) => Pair(2*h,t)) // this is great! NB fold[IntList] to specify which
    // type parameter will be used

    def product: Int = fold(1)(_*_)

    def sum: Int = fold(0)(_+_)

    def fold[A](end: A)(f: (Int, A) => A): A =
      this match {
        case End => end
        case Pair(hd, tl) => f(hd, tl.fold(end)(f))
      }
  }

  case object End extends IntList
  case class Pair(hd: Int, tl: IntList) extends IntList

  println("===sum===")
  val example1 = Pair(1, Pair(2, Pair(4, End)))
  println(example1.sum == 7)
  println("===product===")
  val example2 = Pair(1, Pair(2, Pair(3, End)))
  println(example2.product == 6)
  println("===length===")
  println(example2.length == 3)

}
