package ch06
 
/*
 * �̳�
 */
object DoNothingAction extends UndoableAction {
  override def undo() {}
  override def redo() {}

  //import TrafficLightColor._

}