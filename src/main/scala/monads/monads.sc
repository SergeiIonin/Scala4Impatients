def parseInt(str: String): Option[Int] =
scala.util.Try(str.toInt).toOption

def divide(a: Int, b: Int): Option[Int] =
  if(b == 0) None else Some(a / b)

def stringDivideBy1(aStr: String, bStr: String): Option[Int] = {
  parseInt(aStr).flatMap { aNum =>
    parseInt(bStr).flatMap { bNum =>
      divide(aNum, bNum)
    }
  }
}

def stringDivideBy2(aStr: String, bStr: String): Option[Int] = {
  for {
    aNum <- parseInt(aStr)
    bNum <- parseInt(bStr)
    res <- divide(aNum, bNum)
  } yield res
}

stringDivideBy2("10", "5")

