package ch06

/*
 * �̳�
 * ö������
 * extends  ��չ��
 *
 * ��дһ�� �ǳ����෽���� ����ʹ�� override ���η�
 * ���ó��� super
 * ���ͼ��  isInstanceOf     ����ת��   asInstanceOf
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
    type WeekDay = Value //���������Ϊ�˽�Enumration.Value�����ͱ�¶���������ʹ�ö���
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value //�����ﶨ������ö��ʵ��
  }

  import WeekDay._

}
