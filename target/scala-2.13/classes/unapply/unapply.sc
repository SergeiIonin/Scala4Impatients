case class Book(title: String, author: String, year: Int)
case class BookShort(title: String, author: String)

val book = Book("Scala", "Bob", 1976)

val x: Option[(String, String, Int)] = Book.unapply(book)

val bookShort = BookShort(x.get._1, x.get._2)
