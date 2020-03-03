abstract case class Book(title: String = "", year: Int = 0)

case class Novel(override val title: String, override val year: Int)
  extends Book("blaldasa", 1954)

val novel = Novel("huemoe", 1976)
novel.title

class Biography extends Book

val bio = new Biography
