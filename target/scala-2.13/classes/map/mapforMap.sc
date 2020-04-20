import general.General._

Set(1, 2) == Set(2, 1)

val books = List(Book("Book1 Active", 1986, ACTIVE),
  Book("Book2 Active", 1953, ACTIVE),
  Book("Book3 Active", 2001, ACTIVE),
  Book("Book4 Active", 1900, ACTIVE),
  Book("Book5 Active", 1855, ACTIVE)
)

val booksMap: Map[String, List[Book]] = books groupBy(x => x.title)

val booksMapUpd = booksMap.map {
  case (k, _@List(b)) => (k, b)
}

val nums = (1 to 10).toList
val z = nums groupBy (_ % 2 == 0)


val booksUpdSpan = books.groupBy(_.year < 1960)
booksUpdSpan(false) mkString "\n"
booksUpdSpan(true) mkString "\n"

nums.asInstanceOf[String]


val booksUpd = books map {
  case book@Book(_, year, _)  =>
    if (year < 1960) book.copy(status = SUPER)
    else book
}

val booksFinal = booksUpd.span(_.status != SUPER)

