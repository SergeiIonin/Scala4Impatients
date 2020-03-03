(1 to 10).foreach(println)
(1 to 10).view.foreach(println)

(1 to 10).map(_ * 2)
(1 to 10).view.map(_ * 2).force



/*
both expressions produces OutOfMemoryError
val a = Array.range(0,123456789)
val b = Array.range(0,123456789).view
*/
