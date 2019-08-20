package futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.reflect.ClassTag

object RunningMultipleCalcs extends App {
  println("starting futures")
  val result1 = Cloud.runAlgorithm(10)
  val result2 = Cloud.runAlgorithm(20)
  val result3 = Cloud.runAlgorithm(30)

  println("before for-comprehension")
  val result = for {
    r1 <- result1
    r2 <- result2
    r3 <- result3
  } yield (r1 ++ r2 ++ r3)

  println("before onSuccess")
  result onComplete {
    case result => println(s"total = $result")
  }

  println("before sleep at the end")
  sleep(2000)  // important: keep the jvm alive
}

object Cloud {
  def runAlgorithm(input: Int): Future[Seq[Int]] = Future.apply({
   println(s"processing $input ...")
    Seq(input*2)
  })
}