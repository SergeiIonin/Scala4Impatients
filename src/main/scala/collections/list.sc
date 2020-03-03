val emptyList = List.empty
emptyList.mkString(" ")

val list = List(1, 2, 3)
val listSingle = List(1)
val nil = Nil

def listMatcher[T](l: List[T]) = l match {
  case l@List(_, _*) => s"this is a list $l"
  case Nil => s"this list is Nil"
}

listMatcher(list)
listMatcher(listSingle)
listMatcher(nil)

val seq = Seq(Right(1), Left("Error2"), Right(2), Right(3), Left("Error1"))

def seqEitherMatcherRight[U, V](s: Seq[Either[U, V]]) = s collect {
  case Right(r) => r
}

def seqEitherMatcherLeft[U, V](s: Seq[Either[U, V]]) = s collect {
  case Left(l) => l
}

seqEitherMatcherRight(seq)
seqEitherMatcherLeft(seq)

case class Person(name: String, age: Int)

val persons = List(Person("Bob", 14), List(Person("Jim", 32), Person("Alice", 47)),
  Person("John", 95))
persons.flatten
