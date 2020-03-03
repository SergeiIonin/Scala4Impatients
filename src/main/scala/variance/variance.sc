abstract class Shape

class ShapeCalculator {
  def area: Shape => Double = _ => -1
}

class Circle(rC: Double) extends Shape {
  val r = rC
}

class CircleCalculator extends ShapeCalculator {
  override def area: Shape => Double = (c: Shape) => c match {
    case c: Circle => 3.14*c.r*c.r
    case _ => 0
  }
  def areaOf3Circles(area: Circle => Double) = area.andThen(_ * 3)
}

val shapeCalculator = new ShapeCalculator()
val circleCalculator = new CircleCalculator()

val circle = new Circle(3.0)

circleCalculator.area(circle)
circleCalculator.areaOf3Circles(circleCalculator.area)(circle)
circleCalculator.areaOf3Circles(shapeCalculator.area)(circle) // one can pass Shape => Double, bc
// it's a subtype of Circle => Double




