case class Person(name: String, salary: Double)

val persons = List(Person("Anna-Maria", 3900.45),
  Person("John-Steve", 5900.45),
  Person("Bob", 5900.45),
  Person("Alice", 3900.45))

persons.map(x => s"${x.name} : ${x.salary}")

val applied = Set("Anna-Maria", "Bob", "Alice")

persons.map(_.name).dropWhile(applied)
