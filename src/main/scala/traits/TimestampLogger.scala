package traits

trait TimestampLogger extends ConsoleLogger {
  override def log(msg: String) {
    super.log(s"${java.time.Instant.now} $msg")
    //super[ConsoleLogger].log(s"${java.time.Instant.now} $msg")
  }
}
