package ch05

import scala.beans.BeanProperty

object Demo {

  def main(args: Array[String]): Unit = {
    val a = new demo1
    a.setage_=(10)
    a.name_=("xiaozhang")

    val b = new demo1("xiaoli")
    val c = new demo1("xiaomei", 20)
    val d = new demo2("xiaomeimei", 30)
    println(a.getage, a.name, a.getName(), b.name, c.name, c.getage, d.aa, d.bb, d.demo2.cc)

  }

}

/*
 *  主构造器
 */
class demo1 {
  /*
     * getter
     * setter
     * @BeanProperty 自动生成
     *     1.name :String
     *     2.name_=(newValue: String):Unit
     *     3.getName():String
     *     4.setName():Unit
     */
  private var age = 0
  @BeanProperty var name: String = "xiaoming"

  def getage = age
  def setage_=(newValue: Int) {
    age = newValue
  }

  /*
   * 辅助构造器
   */

  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }

}

/*
 *  主构造器  (在类上直接加 参数)
 *  伴生对象 (与类同名, 实现类似Java的静态方法)
 *
 */
class demo2(name: String, age: Int) {

  def aa = name + "  is " + age + " old"
  def bb = name + "  is a big boy"

  object demo2 {
    val cc = name + "1122"
    def apply(name: String, age: Int) = {
      new demo2(name, age)
    }
  }

}
