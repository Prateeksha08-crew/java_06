package java_6;

import java.util.ArrayList;

public class StudentDatabase {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully!");
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("📭 No students found!");
        } else {
            for (Student student : students) {
                student.displayStudentInfo();
            }
        }
    }
    public void searchStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                student.displayStudentInfo();
                return;
            }
        }
        System.out.println(" Student with ID " + id + " not found.");
    }
    public void removeStudent(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                students.remove(student);
                System.out.println("✅ Student with ID " + id + " removed successfully!");
                return;
            }
        }
        System.out.println(" Student with ID " + id + " not found.");
    }
}
