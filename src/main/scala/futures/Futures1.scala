package futures

// 1 - the imports
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object Futures1 extends App {

  // used by 'time' method
  implicit val baseTime = System.currentTimeMillis
  implicit val pfo = scala.language.postfixOps

  // 2 - create a Future
  val f = Future {
    sleep(500)
    1 + 1
  }

  // 3 - this is blocking (blocking is bad)
  val dur: Duration = 1 second
  val result = Await.result(f, dur)
  println(result)
  sleep(1000)

}
