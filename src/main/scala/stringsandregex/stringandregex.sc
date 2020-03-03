val pattern = "([0-9]+) ([a-z]+)".r
val res = "99 bottles" match {
  case pattern(num, item) => s"it is: $num and $item !"
  case _ => "nope"
}

val uriRegExp = "foo/bar/user".r

val str = "foo/bar/user"
val strCopy = "foo/bar/user"

val res2 = str match {
  case strCopy => true
  case _ => false
}

/*case class Foo()

def foo(msg: Foo) = msg*/

val foo = "foo"
val bar = 2.8
val baz = "baz"

s"$foo $bar $baz"
