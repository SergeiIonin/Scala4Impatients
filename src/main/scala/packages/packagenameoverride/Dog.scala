package packages.packagenameoverride

/**
 *
 * the following name will cause problems with the import of this class in Main
 * package packages.packagenameoverride
 * one can't create a package which name starts from the name of the root package
 *
 * one can create a package below, like
 *    package packagenameoverride
 *    package dog
 *    package dog.packages
 * etc
 * */

class Dog(name: String) {
  def printDogName = Utils.printName(name)
}

object Dog {
  def apply(name: String) = new Dog(name)
}
