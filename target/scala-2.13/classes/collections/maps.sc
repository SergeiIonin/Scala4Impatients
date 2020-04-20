import scala.collection.immutable.HashMap

val map = Map("x" -> 1, "y" -> 2)

map.filterKeys((k: String) => k!="hui")

val key = "z"

val map2 = if (map.contains(key)) map - key else map

map.size

val list1 = List(1,2,3)
val list2 = List(1,2,4)

//list2 -(list1 intersect list2)

val list = List(1,"2",3.0, true)
list.mkString(",")

val map2Seq = map.toSeq.
  partition(_._2 > 1)

/**
 * mutable maps
 * */

import scala.collection.mutable.Map

val mumap = mutable.Map("x" -> 2)

//mumap += 7

