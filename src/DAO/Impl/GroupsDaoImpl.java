package DAO.Impl;

import DAO.GroupsDao;
import Models.Group;
import Models.Student;

import java.util.Arrays;

public class GroupsDaoImpl implements GroupsDao {
    int size ;
    Group [] groups = new Group[0];
    Student [] students = new Student[0];
    @Override
    public void addGroup(Group newGroup) {
        groups = Arrays.copyOf(groups ,groups.length+1);
        groups[groups.length-1] =newGroup;
        size++;
    }


    @Override
    public Group[] getAllGroup() {
        return groups;
    }

    @Override
    public void addStudentByGroupName(String GroupName, Student newStudent) {
        boolean is = false;
        for (Group group : groups) {
            is = true;
            Student [] students = {newStudent};
            group.setStudents(students);
        }
    }

    @Override
    public void delete(long groupId) {
        for (int i = 0; i < size; i++) {
            if (groups[i].getId()==groupId){
                for (int f = i; f < size-1; f++) {
                    groups[f] = groups[f+1];
                }
                size--;
            }
        }
        System.out.println("Deleted!");
        groups=Arrays.copyOf(groups,groups.length-1);
    }

    @Override
    public Group findById(long groupId) {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].getId()==groupId){
                return groups[i];
            }
        }
        return null;
    }

    @Override
    public Student findStudentById(long studentId) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId()==studentId){
                return students[i] ;
            }
        }
        return null;
    }

    @Override
    public void addStudent(Student newStudent) {
        students=Arrays.copyOf(students,students.length+1);
        students[students.length-1]=newStudent;
        size++;
    }

    @Override
    public void findByGroupName(String groupName) {
        for (Group group : groups) {
            if (group.getGroupName().equals(groupName)) {
                System.out.println(group);
                return;
            }
        }
    }

    @Override
    public void findByStudentName(String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)){
                System.out.println(student);
                return;
            }
        }
    }
}
