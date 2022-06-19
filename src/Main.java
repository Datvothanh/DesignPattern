import manager.Expression.FindExpression;
import manager.Expression.IFindExpression;
import manager.impl.*;
import model.Student;
import util.CheckError;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer choose = null;
        boolean exit = false;
        IFindExpression findExpression = new FindExpression();

        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager(findExpression);
        SubjectManager subjectManager = new SubjectManager(findExpression);
        TeacherManager teacherManager = new TeacherManager(findExpression);
        GradesManager gradesManager = new GradesManager(findExpression);
        courseManager.addData();
        // show menu
        showMenu();

        while (true) {
            choose = CheckError.checkChoose(scanner.nextLine());
            switch (choose) {
                case 1:
                    do
                    {
                        studentManager.menu();
                        choose = CheckError.checkChoose(scanner.nextLine());
                        switch (choose)
                        {
                            case 1:
                                studentManager.add();
                                break;
                            case 2:
                                studentManager.showAll();
                                break;
                            case 3:
                                studentManager.delete();
                                break;
                            case 4:
                                studentManager.update();
                                break;
                            case 5:
                                studentManager.searchStudent("AND");
                                break;
                            case 6:
                                studentManager.searchStudent("OR");
                                break;
                            case 0:
                                System.out.println("Exited!\n");
                                break;
                            default:
                                System.out.println("Invalid! please choose action in below menu.\n");
                                break;
                        }
                    } while (choose != 0);
                    break;
                case 2:
                    do
                    {
                        teacherManager.menu();
                        choose = CheckError.checkChoose(scanner.nextLine());
                        switch (choose)
                        {
                            case 1:
                                teacherManager.add();
                                break;
                            case 2:
                                teacherManager.showAll();
                                break;
                            case 3:
                                teacherManager.delete();
                                break;
                            case 4:
                                teacherManager.update();
                                break;
                            case 0:
                                System.out.println("Exited!\n");
                                break;
                            default:
                                System.out.println("Invalid! please choose action in below menu.\n");
                                break;
                        }
                    } while (choose != 0);
                    break;
                case 3:
                    do
                    {
                        courseManager.menu();
                        choose = CheckError.checkChoose(scanner.nextLine());
                        switch (choose)
                        {
                            case 1:
                                courseManager.add();
                                break;
                            case 2:
                                courseManager.showAll();
                                break;
                            case 3:
                                courseManager.showStudentInCourse();
                                break;
                            case 4:
                                courseManager.addStudentToCourse();
                                break;
                            case 5:
                                courseManager.deleteStudentFromCourse();
                                break;
                            case 6:
                                courseManager.update();
                                break;
                            case 0:
                                System.out.println("Exited!\n");
                                break;
                            default:
                                System.out.println("Invalid! please choose action in below menu.\n");
                                break;
                        }
                    } while (choose != 0);
                    break;
                case 4:
                    do
                    {
                        subjectManager.menu();
                        choose = CheckError.checkChoose(scanner.nextLine());
                        switch (choose)
                        {
                            case 1:
                                subjectManager.add();
                                break;
                            case 2:
                                subjectManager.delete();
                                break;
                            case 3:
                                subjectManager.showAll();
                                break;
                            case 0:
                                System.out.println("Exited!\n");
                                break;
                            default:
                                System.out.println("Invalid! please choose action in below menu.\n");
                                break;
                        }
                    } while (choose != 0);
                    break;
                case 5:
                    do
                    {
                        gradesManager.menu();
                        choose = CheckError.checkChoose(scanner.nextLine());
                        switch (choose)
                        {
                            case 1:
                                gradesManager.showAll();
                                break;
                            case 2:
                                gradesManager.add();
                                break;
                            case 0:
                                System.out.println("Exited!\n");
                                break;
                            default:
                                System.out.println("Invalid! please choose action in below menu.\n");
                                break;
                        }
                    } while (choose != 0);
                    break;
                case 0:
                    System.out.println("Exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid! please choose action in below menu.\n");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }

    public static void showMenu() {
        System.out.println("\n-----------Menu------------");
        System.out.println("1. Quản lý sinh viên.");
        System.out.println("2. Quản lý giảng viên.");
        System.out.println("3. Quản lý lớp học.");
        System.out.println("4. Quản lý môn học.");
        System.out.println("5. Quản lý điểm.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
