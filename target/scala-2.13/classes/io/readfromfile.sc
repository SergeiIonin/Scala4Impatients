import java.io.File

val file = new File(
  getClass().getClassLoader().getResource("test.txt").getFile()
)

file.getAbsolutePath
