trait Base {
  def baseField: Int
}

class BaseImpl extends Base {
  val baseField: Int = 1
}

val x = new BaseImpl
val y = x.baseField
