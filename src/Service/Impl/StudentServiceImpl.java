package Service.Impl;

import DAO.Impl.GroupsDaoImpl;
import Models.Student;
import Service.StudentService;

public class StudentServiceImpl implements StudentService {
    private final GroupsDaoImpl groupsDao;
    public StudentServiceImpl(GroupsDaoImpl groupsDao) {
        this.groupsDao = groupsDao;
    }

    @Override
    public void addStudent(Student newStudent) {
        groupsDao.addStudent(newStudent);
    }

    @Override
    public void addStudentByGroupName(String groupName, Student newStudent) {
        groupsDao.addStudentByGroupName(groupName,newStudent);
    }

    @Override
    public Student findByStudentId(long studentId) {
         return groupsDao.findStudentById(studentId);
    }

    @Override
    public void findByStudentName(String studentName) {
        groupsDao.findByStudentName(studentName);
    }
}
