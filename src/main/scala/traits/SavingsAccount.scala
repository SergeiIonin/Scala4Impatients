package traits

abstract class SavingsAccount extends Account with Logger {
 val balance: Double = 100
  def withdraw(amount: Double): Unit = {
    if (amount > balance) log("Not enough")
    else log("OK")
  }
}

