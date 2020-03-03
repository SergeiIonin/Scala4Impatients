case class Person(name: String, age: Int)

val persons = List(Person("Max", 10),
  Person("John", 50), Person("Steve", 23), Person("Max", 20), Person("Alice", 20))

val persons2 = List(Person("John", 50), Person("Max", 30),
  Person("Steve", 23), Person("Alice", 20),
  Person("Max", 40))

val personsNew = persons ++ persons2

val (maxes, others) = personsNew.span(p => p.name.startsWith("Max"))
val res = others.sortBy(x => x.age) ++ maxes.sortBy(x => x.age)

persons2.dropWhile(p => p.name == "Max")

"Fixed hui hui".matches("[^w\\s]")

/*val tuple = groupped

val nil = Nil::List(1)*/

