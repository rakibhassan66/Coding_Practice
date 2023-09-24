package static_variable;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students' info you want to input? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n]; 

        for (int i = 0; i < n; i++) {
            System.out.print("Please enter student " + (i + 1) + "'s name: ");
            String name = scanner.nextLine();
            System.out.print("Please enter student " + (i + 1) + "'s ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            students[i] = new Student(name, id);
        }
        for (Student student : students) {
            student.display();
        }
    }
}
