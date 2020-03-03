package io

import java.io.File
import java.nio.file.Files

object Reader extends App {

  val classloader = Thread.currentThread().getContextClassLoader
  val is = classloader.getResource("test.txt")

  println(is.getPath)

/*  val file = new File(
    getClass().getClassLoader().getResource("test.txt").toString
  )*/



}
