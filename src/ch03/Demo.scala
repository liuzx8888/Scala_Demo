package ch03
import scala.collection.mutable.ArrayBuffer

object Demo {
  def main(args: Array[String]): Unit = {
    /*
 		* 定长数组
 		*/
    val a = Array[Int](5)
    val b = Array(1, 2, 3, 4, 5)

    /*
     * ArrayBuffer  数组缓冲
 		* 可变数组
 		* 申明可变数组
 		* +=  尾部添加元素
 		* ++= 尾部添加其他数组
 		* -=  减去对应的元素
 		* trimEnd   去除最后N个元素
 		* trimStart 去除最开始N个元素
 		* insert  指定位置插入元素
 		* remove  去除指定位置元素
 		* .toArray  数组缓冲转换成数组
 		*/

    val c = ArrayBuffer[Int]()
    c += 0
    c += (1, 2, 3, 4, 5, 6, 7, 8)
    c.++=(Array(100, 200, 300))
    c.-=(100, 200, 300)
    c.trimEnd(5)
    c.trimStart(1)
    c.insert(3, 1000)
    c.remove(3)

    val d = c.toArray
    println(b.mkString, c.mkString, d.mkString)

    /*遍历数组
     *转成另外一个数组 yield
     */
    val e = for (x <- c) yield x * 5
    println(e)

    /*
      * 获取数组值
      * 常规函数使用
      */
    print(e(2), e.sum, e.min, e.max, e.sorted)

  }
}