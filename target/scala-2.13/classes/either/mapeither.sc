val eitherList: Seq[Either[String, String]] = List(Left("error1"), Right("right1"),
  Left("error2"), Right("right2"), Right("right3"))

val right1: Either[String, Int] = Right(1)
val left23: Either[String, Int]  = Left("23.0")

right1.map(x => s"the value is $x").left.map(_.mkString(" "))

left23.map(x => s"the value is $x").left.map(_.mkString(" "))
