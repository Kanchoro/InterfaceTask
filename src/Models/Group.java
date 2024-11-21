package Models;

import java.util.Arrays;

public class Group {
    private long id;
    private String groupName;
    private Student [] students;

    public Group(long id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group info: " +
                "\nid= " + id +
                "\ngroupName= " + groupName +
                "\nstudents= " + Arrays.toString(students) ;
    }
}
