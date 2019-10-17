package ch06
/*
 * 扩展类或者扩展特质
 */
abstract class UndoableAction {

  def undo(): Unit
  def redo(): Unit

}