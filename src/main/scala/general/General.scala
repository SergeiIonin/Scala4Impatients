package general

object General {

  sealed trait Status
  case object REJECTED extends Status
  case object ACTIVE extends Status
  case object SUPER extends Status

  case class Book(title: String, year: Int, status: Status)

}
