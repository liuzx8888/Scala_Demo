package ch06
 
/*
 * ผฬณะ
 */
object DoNothingAction extends UndoableAction {
  override def undo() {}
  override def redo() {}

  //import TrafficLightColor._

}