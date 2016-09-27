package file_matcher

import java.io.File

object FileMatcher {

  private def files = (new File(".")).listFiles

  private def filesMatcher(matcher: String => Boolean) = {
    for (file <- files; if matcher(file.getName))
      yield file
  }

  // API
  def filesEndsWith(query: String) =
    filesMatcher(_.endsWith(query))

  def filesContains(query: String) =
    filesMatcher(_.contains(query))

  def filesRegex(query: String) =
    filesMatcher(_.matches(query))
}
