package file_matcher

object App {
  def main(args: Array[String]) = {
    println("File Matcher Example")

    for (file <- FileMatcher.filesContains("s"))
      println(file.getName)
  }
}
