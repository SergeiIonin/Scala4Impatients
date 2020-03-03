case class Book(title: String, year: Int)


val books = List(Book("aaa", 2005), Book("bbb", 1968),
  Book("ccc", 2000), Book("ddd", 1963))


val booksAfter2000 = books.collect {
  case b@Book(_, year) if (year >= 2000) => b
}

