// unapply
class Name(val firstName: String, val lastName: String)

object Name {
  def apply(firstName: String, lastName: String): Name = new Name(firstName, lastName)
  def unapply(input: Name): Option[(String, String)] = if (input == None) None else Some(input.firstName, input.lastName)
}

val someName = Name("Bob", "Scott")
val Name(firstName,lastName) = someName
println(s"${firstName} ${lastName}")


3+4 -> 5
//3 -> 4+5 this will produce an error!

class Person(val firstName: String, val secondName: String) {
  /*override def equals(o: Any): Boolean = {
    if (o.isInstanceOf[Person]) {
      val other = o.asInstanceOf[Person]
      if (other.firstName == firstName &&
      other.secondName == secondName) true
      else false
    }
    else false
  }*/

  override def equals(o: Any): Boolean = o match {
    case o: Person => {
      if (o.firstName == firstName &&
        o.secondName == secondName) true
      else false
    }
    case _ => false
  }

  //def stub = s"$firstName $secondName"
}

val alice0 = new Person("Alice", "Scott")
val alice1 = new Person("Alice", "Scott")
alice0 == alice1