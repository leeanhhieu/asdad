package dmooo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String dateOfBirth;
    private String address;
    private double gpa;

    public Student(int id, String name, String dateOfBirth, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Date of Birth: " + dateOfBirth +
                ", Address: " + address +
                ", GPA: " + gpa;
    }
}

public class StudentManagementSystem {
    private ArrayList<Student> studentList;
    private Scanner scanner;

    public StudentManagementSystem() {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.println("Enter student details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();

        Student student = new Student(id, name, dateOfBirth, address, gpa);
        studentList.add(student);

        System.out.println("Student added successfully!");
        System.out.println();
    }

    public void editStudent() {
        System.out.print("Enter student ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found!");
        } else {
            System.out.println("Current details:");
            System.out.println(student);

            System.out.println("Enter new details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Date of Birth: ");
            String dateOfBirth = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();

            student.setName(name);
            student.setDateOfBirth(dateOfBirth);
            student.setAddress(address);
            student.setGpa(gpa);

            System.out.println("Student details updated successfully!");
        }

        System.out.println();
    }

    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();

        Student student = findStudentById(id);
    }
}
