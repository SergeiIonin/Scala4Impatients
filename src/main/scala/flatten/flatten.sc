val list: List[Option[Int]] = List(Some(1), Some(2), Some(3), None)
val listEither: List[Either[String,Int]] = List(Right(1), Left("x"),
  Right(2), Left("y"), Right(3), Right(4))


val res = list.flatten
val res2 = listEither.collect {
  case Right(r) => r
}

val r: Either[Seq[String], Int] = Left(Seq("1", "2", "3"))
val r2: Either[Seq[String], Int] = Right(10)

val l = r.left.map(_.mkString)
val l2 = r2.left.map(_.mkString)
