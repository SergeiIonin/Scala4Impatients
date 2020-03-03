case class Person(name: String, salary: Double, rowNum: Int = 0)

val persons = List(Person("Anna-Maria", 3900.45),
  Person("John-Steve", 5900.45),
  Person("Bob", 5900.45),
  Person("Alice", 3900.45))

val nums = 1 to persons.length

val res = persons.zip(LazyList from 1).map {
  case (x, y) => x.copy(rowNum = y)
}

//persons.map(p => nums.map(n => ))
