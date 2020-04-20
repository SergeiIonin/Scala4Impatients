def divide(a: Int, b: Int): Option[Int] = b match {
  case 0 => None
  case _:Int => Some(a/b)
}

divide(60,6)

def toInt(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }
}

val x = toInt("1").getOrElse(0)

case class Book(title: String, author: String)

val book = Some(Book("Adventures", "Bob Scott"))

val res = book.map(x => x match {
  case b: Book => s"it's ${b.author}"
  case _ => ""
  //case Some(b: Book) => s"it's ${b.author}"
}).getOrElse("smth went bad")

val opt1: Option[Int] = Some(5)
val opt2: Option[Int] = None

val r = for {
  i1 <- opt1
  i2 <- opt2
} yield i1 + (if (i2 > 0) i2 else 0)

/**
 * check that List[Option[Inr]] collect may lead to Nil
 * */
val listOptStr = List(Some(1), None, Some(2), None)
val listNils: List[Option[Int]] = List(None, None, None)

val notNil = listOptStr.collect {
  case Some(x) => x
}
//val notNil2 = listOptStr.collect(_.isDefined)

val beNil = listNils.collect {
  case Some(x) => x
}
val beNil2 = listNils.filter(_.isDefined)

if (beNil == Nil) "nil" else "not nil"
