package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
class Student{
    private String name;
    private int age;
    private double gpa;
    public Student(String name, int age, double gpa) {
        super();
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentTest [toString()=" + super.toString() + "]";
    }
    public static void studentGPA_7() {

        Logger ou = Logger.getLogger("com.api.jar");
        Scanner in=new Scanner(System.in);
        String name;
        int age;
        double gpa;
        ou.info("For how many number of students do you want to get GPA ??");
        int a=in.nextInt();
        List<Student> students=new ArrayList<>();
        int b=1;
        while(a>=1) {
            String s1="Enter the student_"+b+" details :";
            String s2="Student_"+b+" Name : ";


            ou.info(s1);


            ou.info(s2);

            name=in.next();
            String s3=name+" Age : ";
            ou.info(s3);
            age=in.nextInt();
            String s4=name+" GPA : ";
            ou.info(s4);
            gpa=in.nextDouble();
            b++;
            a--;

            students.add(new Student(name,age,gpa));
        }
        ou.info("This is the list WITH OUT SORTING  the students GPA's.....");
        for (Student student : students) {
            ou.info("Name: " + student.getName());
            ou.info("Age: " + student.getAge());
            ou.info("GPA: " + student.getGpa());
        }
        ou.info("This is the list AFTER SORTING the students GPA's.....");
        Collections.sort(students, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        for (Student student : students) {
            ou.info("Name: " + student.getName());
            ou.info("Age: " + student.getAge());
            ou.info("GPA: " + student.getGpa());
        }
        in.close();


    }
}