package DAO;

import Models.Group;
import Models.Student;
import Service.Impl.GroupServiceImpl;

public interface GroupsDao {

    void addGroup(Group newGroup);
    Group [] getAllGroup();
    default void addStudentByGroupName(String GroupName, Student newStudent){
    }
    void delete (long groupId);
    Group findById(long groupId);
    Student findStudentById(long studentId);
    void addStudent(Student newStudent);
    void findByGroupName(String groupName);
    void findByStudentName(String studentName);
}
