
// (1)
Array(1) == Array(1)
// the only way it could work
Array(1) sameElements Array(1)

// (2)
def asOption1[A](a: A) = Some(a)
def asOption2[A](a: A): Option[A] = Some(a) // better way
/*client of the library may suffer in compatibility
if the type was changed; public members should be always type annotated
Inferred types may be not that you expect
*/
/*
IN Scala 3 impl. members will be required to be type annotated
*/
val a1 = asOption1(1)
val a2 = asOption2(1)

// (3)
// Prefer ASCII operator (whole arrow of Unicode will not go)

val x = 1 -> 4 / 2

// (4)
// Use ADT instead of extending Enumeration trait
class Ex4 {
  /*if not extends Product with Serializable, then
  * type inference will contain 'em
  * */
  sealed trait Status4 //extends Product with Serializable

  object Status {
    case object Ok extends Status4
    case object Nok extends Status4
  }

  val l = List(Status.Ok, Status.Nok)
l
//  class Foo extends Status
  // then the compiler will warn us in patmat
  def foo(s: Status4) = s match {
    case Status.Ok => println("Ok")
  }
}

// (5)
// when using sealed traits, provide defense from inheritance
sealed trait Foo
final class Bar extends Foo
case class Ok5() extends Foo
case class Nok5() extends Foo

class SubOk5 extends Ok5
//class SubBar extends Bar  - this is impossible once the Bar
// is final; but one can extend case class though...



