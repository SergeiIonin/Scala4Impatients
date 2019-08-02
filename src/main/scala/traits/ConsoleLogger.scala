package traits

trait ConsoleLogger extends Logger {
  def log(msg: String) = println(msg)
}
