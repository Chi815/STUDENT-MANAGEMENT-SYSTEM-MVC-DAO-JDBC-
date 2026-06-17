package view;

import controller.StudentController;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    Scanner sc = new Scanner(System.in);
    StudentController controller = new StudentController();

    public void start() {

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort By Marks");
            System.out.println("7. Search By Course");
            System.out.println("8. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    sortStudents();
                    break;

                case 7:
                    searchByCourse();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private void addStudent() {

        System.out.print("ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Email : ");
        String email = sc.nextLine();

        if (!email.contains("@")) {
            System.out.println("Invalid Email");
            return;
        }

        System.out.print("Course : ");
        String course = sc.nextLine();

        System.out.print("Marks : ");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100");
            return;
        }

        Student s = new Student(id, name, email, course, marks);

        controller.getDao().addStudent(s);
    }

    private void viewStudents() {

        List<Student> list = controller.getDao().getAllStudents();

        for (Student s : list) {
            System.out.println("----------------");
            System.out.println(s);
        }
    }

    private void searchStudent() {

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        Student s = controller.getDao().getStudentById(id);

        if (s == null) {
            System.out.println("Student not found");
        } else {
            System.out.println(s);
        }
    }

    private void updateStudent() {

        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("New Name : ");
        String name = sc.nextLine();

        System.out.print("New Email : ");
        String email = sc.nextLine();

        System.out.print("New Course : ");
        String course = sc.nextLine();

        System.out.print("New Marks : ");
        double marks = sc.nextDouble();

        Student s = new Student(id, name, email, course, marks);

        if (controller.getDao().updateStudent(s)) {
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    private void deleteStudent() {

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        if (controller.getDao().deleteStudent(id)) {
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    private void sortStudents() {

        List<Student> list = controller.getDao().sortByMarks();

        for (Student s : list) {
            System.out.println("----------------");
            System.out.println(s);
        }
    }

    private void searchByCourse() {

        sc.nextLine();

        System.out.print("Enter Course : ");
        String course = sc.nextLine();

        List<Student> list = controller.getDao().searchByCourse(course);

        if (list.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : list) {
                System.out.println("----------------");
                System.out.println(s);
            }
        }
    }
}