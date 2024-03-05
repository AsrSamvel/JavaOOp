package FifthEx.View;

import java.util.List;

import FifthEx.Model.Student;

public class StudentView implements UserView<Student> {
  @Override
  public void sendOnConsole(List<Student> list) {
      for (Student student : list) {
          System.out.println(student);
      }
  }
}
