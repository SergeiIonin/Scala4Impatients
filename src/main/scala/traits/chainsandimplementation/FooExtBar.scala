package traits.chainsandimplementation

trait FooExtBar extends Bar {
  /**
   * this trait may not override the def bar() from the Bar trait
   * */
  def bar(): Unit = println("bar")
}
