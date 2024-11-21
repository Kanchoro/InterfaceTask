import DAO.GroupsDao;
import DAO.Impl.GroupsDaoImpl;
import Models.Group;
import Models.Student;
import Service.Impl.GroupServiceImpl;
import Service.Impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GroupsDaoImpl groupsDao = new GroupsDaoImpl();
        GroupServiceImpl groupService = new GroupServiceImpl(groupsDao);
        StudentServiceImpl studentService1 = new StudentServiceImpl(groupsDao);

        groupService.addGroup(new Group(1L,"js15"));
        groupService.addGroup(new Group(2L,"j16"));
        groupService.addGroup(new Group(3L,"js16"));

//        System.out.println(Arrays.toString(groupService.getAllGroup()));
        studentService1.addStudentByGroupName("j16",(new Student(1L,99685856,"m", LocalDate.of(2003,10,7),"mara","kana")));

        //Find By Group Name
//        groupService.findByGroupName("j16");

        //DELETE
//        groupService.delete(3);
//        System.out.println(Arrays.toString(groupService.getAllGroup()));
//        System.out.println("================================");
        //FIND BY GROUP ID
//        System.out.println(groupService.findById(1));
        //FIND BY STUDENT ID
        studentService1.addStudent(new Student(1L,99685856,"m", LocalDate.of(2003,10,7),"mara","kana"));
        studentService1.addStudent(new Student(2L,99685856,"m", LocalDate.of(2003,10,7),"mara","kana2"));
//        System.out.println(studentService1.findByStudentId(2L));

        //Find By Student Name
//        studentService1.findByStudentName("kana");
    }
}