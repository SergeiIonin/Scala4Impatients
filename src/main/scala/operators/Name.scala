package operators

  class Name(val firstName: String, val lastName: String) {

  }

  object Name {
    def apply(firstName: String, lastName: String): Name = new Name(firstName, lastName)
    def unapply(input: Name): Option[(String, String)] = if (input == None) None else Some(input.firstName, input.lastName)
  }



object Demo extends App {

  val someName = Name("Bob", "Scott")
  val Name(firstName,lastName) = someName
  println(s"${firstName} ${lastName}")

}
