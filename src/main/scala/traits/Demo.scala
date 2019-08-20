package traits

object Demo extends App {
  val acc1 = new SavingsAccount with TimestampLogger with ShortLogger
  val acc2 = new SavingsAccount with ShortLogger with TimestampLogger
  acc1.withdraw(500)
  acc2.withdraw(500)
}