/**
 * case-to-case inheritance is prohibited
 * */
/*abstract case class Book(title: String = "", year: Int = 0)

case class Novel(override val title: String, override val year: Int)
  extends Book()

val novel = Novel("huemoe", 1976)
novel.title

class Biography extends Book

val bio = new Biography*/

/**
 * The approach to inherit class by the other
 * */
class Currency(val title: String = "", val country: String = "")

case class Dollar(override val title: String = "dollar", isReserved: Boolean = true) extends Currency
val `$` = Dollar()
`$`.title

  /**
    * this code won't compile bc 2 params are expected
  **/
/*val dollarIs = `$` match {
  case Dollar(t, c, isRes) => "yes"
}*/
