val map = Map("x" -> 1, "y" -> 2)

val key = "z"

val map2 = if (map.contains(key)) map - key else map

map.size

val list1 = List(1,2,3)
val list2 = List(1,2,4)

//list2 -(list1 intersect list2)

val list = List(1,"2",3.0, true)
list.mkString(",")

