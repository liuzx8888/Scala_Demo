package ch06
/*
 * ��չ�������չ����
 */
abstract class UndoableAction {

  def undo(): Unit
  def redo(): Unit

}