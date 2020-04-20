package objects.packageprivatemethodsofobject.pack2

/**
 * The object may be package private as well as object's fields
 * */

/*private[pack2]*/ object MyObjectWithOnePackagePrivateMethod {

  def foo = println("foo")

  private[pack2] def bar = println("bar")

}
