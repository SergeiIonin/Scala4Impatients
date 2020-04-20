val emptyList = List.empty
emptyList.mkString(" ")

val list = List(1, 2, 3)
val listSingle = List(1)
val nil = Nil

/**
 * this is the proper way to match against list if one want
 * to distinguish Nil and non-empty List
 * */
def listMatcherNonEmpty[T](l: List[T]) =
  if (l.nonEmpty) s"this is a list $l"
else s"this list is Nil"

def listMatcher[T](l: List[T]) = l match {
  case l@List(_, _*) => s"this is a list $l"
  case Nil => s"this list is Nil"
}

def listMatcher2[T](l: List[T]) = l match {
  case l@List(_*) => if (l.isEmpty) s"this list is Nil"
  else s"this is a list $l"
}

val isEmptyForNil = Nil.isEmpty

listMatcher(list)
listMatcher(listSingle)
listMatcher(nil)
///////////
listMatcherNonEmpty(list)
listMatcherNonEmpty(listSingle)
listMatcherNonEmpty(nil)
///////////
listMatcher2(list)
listMatcher2(listSingle)
listMatcher2(nil)

/*val seq = Seq(Right(1), Left("Error2"), Right(2), Right(3), Left("Error1"))

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
  Person("John", 95))*/
