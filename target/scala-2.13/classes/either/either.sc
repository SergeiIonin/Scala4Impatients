val right1: Right[Double, Int] = Right(1)
val right11: Either[Nothing, Int] = Right(11)
val right2: Right[Double, Int] = Right(2)
val right3: Right[Double, Int] = Right(3)
val left23: Left[Double, Int]  = Left(23.0)
val left42: Left[Double, Int]  = Left(42.0)

for {
     x <- right1
     y <- right2
     z <- right3
   } yield x + y + z // Right(6)

  for {
      x <- right1
      y <- right2
      z <- left23
    } yield x + y + z // Left(23.0)

  val x: Either[Double, Int] = for {
      x <- right1
      y <- left23
      z <- right2
    } yield x + y + z // Left(23.0)

right1.
  flatMap(x => left23.flatMap(y => right2.map(z => x+y+z)))

val filt1 = Left(12).left.filter(_ > 10)  // Some(Left(12))
val filt2 = Left(7).left.filter(_ > 10)   // None
val filt3 = Right(12).right.filter(_ > 10) // None
