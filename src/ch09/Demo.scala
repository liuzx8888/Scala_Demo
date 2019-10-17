package ch09
import scala.io.Source
import scala.collection.Iterator
object Demo {
  def main(args: Array[String]): Unit = {
    val path = "E:\\1122\\a.txt"
    val source = Source.fromFile(path)
    /*
 * ∂¡»°––
 */
    val lines = source.getLines()
    print(lines.toArray.mkString)

    source.close()
  }
}