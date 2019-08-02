package traits

trait TimestampLogger extends ConsoleLogger {
  override def log(msg: String) {
    super[ConsoleLogger].log(s"${java.time.Instant.now} $msg")
  }
}
