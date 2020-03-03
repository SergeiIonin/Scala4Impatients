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



