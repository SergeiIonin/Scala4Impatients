class Person(val age: Int, sex: String) { // parameters will be not accessible in the companion object
  import Person._
  private val p = true // will be accessible in the companion object
  def yearsToRetirement = if (Person.o_p) Person.getYearsToRetirement(this.age, this.sex)
  def printPerson = s"age is ${this.age} and sex is ${this.sex}"
  val field = 1
  o_p
}

object Person {
  private val o_p = true // will be accessible in the companion class
  val retirementAgeMale = 65
  val retirementAgeFemale = 60

  def getYearsToRetirement(age: Int, sex: String) = {
    if (age > 0) {
      if (sex == "M") retirementAgeMale - age
      else if (sex == "F") retirementAgeFemale - age
      else throw new RuntimeException("Inappropriate sex")
    }
    else throw new RuntimeException("Inappropriate age")
  }

  def apply(age: Int, sex: String) = new Person(age, sex)

}

val bob = Person(55, "M")
bob.age

val retYears = bob.yearsToRetirement
