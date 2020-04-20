/**
 * with flatMap and Option one can easily  make a filtered
 * collection
 * */

def intToStr(int: Int): Option[String] =
  if (int % 2 == 0) Some(s"$int") else None

val listInts: Seq[Int] = 1 to 3

val res = listInts.flatMap(intToStr)

val optInt = Some(1)

"1".toInt + 2

//optInt.flatMap()
