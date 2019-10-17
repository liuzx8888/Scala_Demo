package ch04
import scala.collection.mutable.Map
import scala.collection.mutable.StringBuilder
import scala.collection.SortedMap

object Demo {
  def main(args: Array[String]): Unit = {
    /*
     * SortedMap  排序映射
     */
    val mapa = Map(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d", 5 -> "e", 6 -> "f")
    val mapb = Map((1, "a"), (2, "b"), (3, "c"), (4, "d"), (5, "e"), (6, "f"))
    val mapc = SortedMap((1, "a"), (2, "b"), (3, "c"), (5, "e"), (6, "f"), (4, "d"))
    /*
     * 获取值
     * 修改值
     * 增加关系 +=
     * 去除关系 -=
     */

    var a = mapa(5)
    mapa(5) = "aaaaa"
    a = mapa(5)
    mapa.+=((6, "aa"), (7, "bb"), (8, "cc"))
    mapa.-=(6, 7, 8)
    //    if (mapa.contains(10)) {
    //      a == mapa(10)
    //    }

    println(mapa.toVector, mapa.toVector(3), mapb.toArray.mkString, a)

    /*迭代处理 Map
     *
     */
    var aa = 0
    var bb: StringBuilder = StringBuilder.newBuilder
    for ((x: Int, y: String) <- mapa) {
      aa += x
      bb.append(y)
    }

    println(aa, bb, mapc)

    /*
    * 元组(tuple)
    * 获取值
    * zip 拉链操作
    */
    val cc = (1, "a", Map(3 -> "f"))
    val dd = Array("<", "=", ">")
    val ee = Array(2, 3, 4)
    print(cc.getClass.toString(), cc._1, dd.zip(ee).mkString)

  }
}