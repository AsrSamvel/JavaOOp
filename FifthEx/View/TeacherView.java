package FifthEx.View;

import java.util.List;

import FifthEx.Model.Teacher;

public class TeacherView implements UserView<Teacher> {
  @Override
  public void sendOnConsole(List<Teacher> list) {
      for (Teacher teacher : list) {
          System.out.println(teacher);
      }
  }
}
