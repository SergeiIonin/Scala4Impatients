class Pair[T](val first: T, val second: T) {
  //def replaceFirst(newFirst: T) = new Pair[T](newFirst, second)
  def replaceFirst[R >: T](newFirst: R) = new Pair(newFirst, second)
}

val pair = new Pair("Alice", "Johnes")
val pair2 = pair.replaceFirst("Bob")
s"${pair2.first} ${pair2.second}"
