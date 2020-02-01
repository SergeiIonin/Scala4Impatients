package packages

package foo.bar

object Foo extends App {
  println("Hi")
}

object Bar {
  import foo.bar.Foo
}
