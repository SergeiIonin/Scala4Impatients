val name = Seq("Nidhi", "Singh")
name.map(_.toLowerCase).flatten
name.flatMap(_.toUpperCase)

val list = List(2, 3, 4)
def f(x: Int) = List(x-1, x, x+1)
val mappedList = list.map(f(_))
val flatMappedList = list.flatMap(f(_))

val seq = Seq(4, 5, 6, 7)

val flatSeq = seq flatMap(x => Seq(x-1, x+1))

val seq1 = Seq(8, 15, 22, 23, 24)

val flatSeq1 = seq1 flatMap(x => if (x % 3 == 0) Seq(x) else Seq(-x))

val li = List(1, 2)
val ls = List("one", "two")

val res = li.flatMap(x => ls.map(y => (x, y)))

case class Book(title: String, authors: String*)

val books: List[Book] =
  List(
    Book(
      "Structure and Interpretation of Computer Programs",
      "Abelson, Harold", "Sussman, Gerald J."
    ),
    Book(
      "Principles of Compiler Design",
      "Aho, Alfred", "Ullman, Jeffrey"
    ),
    Book(
      "Programming in Modula-2",
      "Wirth, Niklaus"
    ),
    Book(
      "Elements of ML Programming",
      "Ullman, Jeffrey"
    ),
    Book(
      "The Java Language Specification", "Gosling, James",
      "Joy, Bill", "Steele, Guy", "Bracha, Gilad"
    )
  )


val bookGosling: Seq[String] = books
  .flatMap((b: Book) =>
    b.authors
      .withFilter((a: _root_.scala.Predef.String) => a.startsWith("Gosling"))
      .map((a: _root_.scala.Predef.String) => (b.title))
  )

val booksProgramInTitle = for {
  b <- books if b.title.contains("Program")
} yield b.title


val authorsManyBooks = (for {
  b1 <- books
  b2 <- books if b1 != b2
    a1 <- b1.authors
    a2 <- b2.authors if a1 == a2
  } yield a2).toSet

val authorsManyBooks2 = books flatMap (b1 =>
  books withFilter (b2 => b1 != b2) flatMap (b2 =>
    b1.authors flatMap (a1 =>
      b2.authors withFilter (a2 => a1 == a2) map (a2 =>
        a1))))

case class User(name: String, age: Int)

val userBase = List(User("Travis", 28),
  User("Kelly", 33),
  User("Jennifer", 44),
  User("Dennis", 23))

val twentySomethings = for (user <- userBase if (user.age >=20 && user.age < 30))
  yield user.name


val n = 10
val v = 10

val resForComp = for (i <- 0 until n;
     j <- 0 until n if i + j == v)
  yield (i, j)

/*for {i <- 0 until() n;
     j <- 0 until n if i + j == v}
  yield (i, j)*/

val resDirect = (0 until n).flatMap {
  i => (0 until n).
    withFilter(j => (i+j)==v).
    map(j => (i,j))
}
