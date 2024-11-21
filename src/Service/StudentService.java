package Service;

import Models.Group;
import Models.Student;

public interface StudentService {
    void addStudent(Student newStudent);
    void addStudentByGroupName(String GroupName, Student newStudent);
    Student findByStudentId (long studentId);
    void findByStudentName (String studentName);
}
