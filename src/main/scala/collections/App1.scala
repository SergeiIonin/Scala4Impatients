package collections

object App1 extends App {
  val map2Seq = Map("x" -> 1, "y" -> 2).toSeq.
    partition(_._2 > 1)
}
