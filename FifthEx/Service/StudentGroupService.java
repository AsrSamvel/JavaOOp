package FifthEx.Service;

import java.util.List;
import FifthEx.Model.Student;
import FifthEx.Model.StudentGroup;
import FifthEx.Model.Teacher;

public class StudentGroupService { private final StudentGroup studentGroup = new StudentGroup();
    private Integer maxGroupId = 0;
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroup.setGroupId(++maxGroupId);
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(studentList);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
