import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        StudentAssignmentStack stack = new StudentAssignmentStack(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.println("5. View First Assignment");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("NIM: ");
                    String nim = scan.nextLine();

                    System.out.print("Class Name: ");
                    String className = scan.nextLine();

                    Student std = new Student(nim, name, className);
                    stack.push(std);

                    System.out.println(name + "'s assignment has been successfully submitted!!");
                    break;

                case 2:
                    Student gradedStudent = stack.pop();

                    if (gradedStudent != null) {
                        System.out.println("Grading assignment from " + gradedStudent.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        scan.nextLine();

                        gradedStudent.grading(grade);
                        System.out.println("Assignment grade of " + gradedStudent.name + " is " + gradedStudent.grade);
                    }
                    break;

                case 3:
                    Student topStudent = stack.peek();

                    if (topStudent != null) {
                        System.out.println("The last assignment comes from " + topStudent.name);
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    Student firstStudent = stack.getFirst();

                    if (firstStudent != null) {
                        System.out.println("The first assignment comes from " + firstStudent.name);
                    }
                    break;

                default:
                    System.out.println("Invalid menu!");
                    break;
            }

            System.out.println();

        } while (choice >= 1 && choice <= 5);

        scan.close();
    }
}