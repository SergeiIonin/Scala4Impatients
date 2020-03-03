
val list: List[Int] = (1 to 5).toList
list.fold(0)(_ + _)

(1 to 5).view.fold(1)((acc: Int, next: Int) => acc * next)
