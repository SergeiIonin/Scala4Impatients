sealed trait Status
case object REJECTED extends Status
case object ACTIVE extends Status
case object SUPER extends Status

case class Book(title: String, year: Int, status: Status)


val books = List(Book("book1 active", 1986, ACTIVE),
  Book("book2 active", 1953, ACTIVE),
  Book("book3 active", 2001, ACTIVE),
  Book("book4 active", 1900, ACTIVE),
  Book("book5 active", 1855, ACTIVE)
)


