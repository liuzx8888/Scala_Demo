package ch03
import scala.collection.mutable.ArrayBuffer

object Demo {
  def main(args: Array[String]): Unit = {
    /*
 		* ��������
 		*/
    val a = Array[Int](5)
    val b = Array(1, 2, 3, 4, 5)

    /*
     * ArrayBuffer  ���黺��
 		* �ɱ�����
 		* �����ɱ�����
 		* +=  β�����Ԫ��
 		* ++= β�������������
 		* -=  ��ȥ��Ӧ��Ԫ��
 		* trimEnd   ȥ�����N��Ԫ��
 		* trimStart ȥ���ʼN��Ԫ��
 		* insert  ָ��λ�ò���Ԫ��
 		* remove  ȥ��ָ��λ��Ԫ��
 		* .toArray  ���黺��ת��������
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

    /*��������
     *ת������һ������ yield
     */
    val e = for (x <- c) yield x * 5
    println(e)

    /*
      * ��ȡ����ֵ
      * ���溯��ʹ��
      */
    print(e(2), e.sum, e.min, e.max, e.sorted)

  }
}