val right1: Either[String, Int] = Right(1)
val left23: Either[String, Int]  = Left("23.0")


def eitherExtractor[U, V](e: Either[U, V]) = e match {
  case Right(r) => r
}

eitherExtractor(right1)


val empt = Seq.empty[String]

val res = empt.map(x => s"x is $x")
