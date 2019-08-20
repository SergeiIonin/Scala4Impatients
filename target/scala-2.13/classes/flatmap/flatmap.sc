val name = Seq("Nidhi", "Singh")
name.map(_.toLowerCase).flatten
name.flatMap(_.toUpperCase)

val list = List(2, 3, 4)
def f(x: Int) = List(x-1, x, x+1)
val mappedList = list.map(f(_))
val flatMappedList = list.flatMap(f(_))

val seq = Seq(4, 5, 6, 7)

val flatSeq = seq flatMap(x => Seq(x-1, x+1))

val seq1 = Seq(8, 15, 22, 23, 24)

val flatSeq1 = seq1 flatMap(x => if (x % 3 == 0) Seq(x) else Seq(-x))