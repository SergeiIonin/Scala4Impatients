// can assign function to val
import scala.math._
val fun = ceil _
val fun2: Double => Double = ceil

val f = (_: String).charAt(_: Int)
f("now", 1)
val g:(String, Int) => Char = _.charAt(_)
g("now",1)

Array(3.14, 1.42, 2.0).map(x=> (x*2))

def mulBy(factor: Double) = (x: Double) => factor*x
val triple = mulBy(3)
triple(6)
mulBy(3)(7)

def valueAtQuarter(f: Double => Double) = f(0.25)
valueAtQuarter(3*_)

(1 to 9) map (_*0.1)
(1 to 9).map("*" * _ ).foreach(println _)
(1 to 9) reduceLeft(_*_)

"This is soo fucking awesome".split(" ").sortWith(_.length < _.length)

val seqA = Array("Hello", "World")
val seqB = Array("hello", "world")
seqA.corresponds(seqB)(_.equalsIgnoreCase(_))

//Control abstractions

def until(condition: => Boolean)(block: => Unit) {
  if(!condition) {
    block
    until(condition)(block)
  }
}

var x = 10
until(x==0) {
  x -= 1
  println(x)
}