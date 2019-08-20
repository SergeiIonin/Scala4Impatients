sealed abstract class Command extends Product with Serializable

object Command {
  final case class Move(meters: Int) extends Command
  final case class Rotate(degrees: Int) extends Command
}

def print(cmd: Command) = cmd match {
  case Command.Move(dist) => s"move for $dist"
 // case Command.Rotate(angle) => s"rotate for $angle"
}

print(Command.Move(10))
print(Command.Rotate(45))



