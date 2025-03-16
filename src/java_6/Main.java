package java_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDatabase db = new StudentDatabase();

        while (true) {
            System.out.println("\n📚 Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Number of Subjects: ");
                    int n = sc.nextInt();

                    int[] marks = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }

                    db.addStudent(new Student(id, name, marks));
                    break;

                case 2:
                    db.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    db.searchStudentById(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();
                    db.removeStudent(removeId);
                    break;

                case 5:
                    System.out.println(" Exiting the system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice! Please try again.");
            }
        }
    }
}
