package ch06

/*
 * 继承
 * 枚举类型
 * extends  扩展类
 *
 * 重写一个 非抽象类方法， 必须使用 override 修饰符
 * 调用超类 super
 * 类型检测  isInstanceOf     类型转换   asInstanceOf
 */
object DoNothingAction /*extends UndoableAction*/ {
  def undo() {}
  def redo() {}

  if (this.isInstanceOf[UndoableAction]) {
    print(true)
  } else {
     this.asInstanceOf[UndoableAction]
  }

  object WeekDay extends Enumeration {
    type WeekDay = Value //这里仅仅是为了将Enumration.Value的类型暴露出来给外界使用而已
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value //在这里定义具体的枚举实例
  }

  import WeekDay._

}
