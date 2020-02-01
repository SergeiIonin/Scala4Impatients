package packages.packagenameoverride

class Cat(name: String) {
  def printCatName = Utils.printName(name)
}

object Cat {
  def apply(name: String) = new Cat(name)
}
