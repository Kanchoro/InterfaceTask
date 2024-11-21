package Models;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private String lastName;
    private LocalDate age;
    private String gender;
    private int phoneNumber;

    public Student() {
    }

    public Student(long id, int phoneNumber, String gender, LocalDate age, String lastName, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.lastName = lastName;
        this.name = name;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student info:" +
                "\nid= " + id +
                "\nname= " + name  +
                "\nlastName= " + lastName  +
                "\nage= " + age +
                "\ngender= " + gender  +
                "\nphoneNumber= " + phoneNumber ;
    }

}
