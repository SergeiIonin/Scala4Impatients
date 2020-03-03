case class Person(name: String, salary: Double)


val persons = List(Person("Anna-Maria", 3900.45),
  Person("John-Steve", 5900.45),
  Person("Bob", 5900.45),
  Person("Alice", 3900.45))

  persons.map(x => s"${x.name} : ${x.salary}")

persons
    .sortWith((x,y) => (x.salary > y.salary))
    .map(x => s"${x.name} : ${x.salary}")

persons
  .sortWith((x,y) => (x.salary > y.salary))
  .sortWith((x,y) => (if (x.salary == y.salary)
    x.name.length < y.name.length else false))
  .map(x => s"${x.name} : ${x.salary}")

persons
  .sortWith((x,y) => (if (x.salary == y.salary)
    x.name.length < y.name.length else x.salary > y.salary))
  .map(x => s"${x.name} : ${x.salary}")

persons.sortWith((x,y)=>false)
