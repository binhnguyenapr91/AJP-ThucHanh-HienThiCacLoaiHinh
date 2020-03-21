import java.util.Scanner;

public class App {

    void showMenu() {
        System.out.println("---MENU---");
        System.out.println("1.Print rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("----------");
        System.out.println("0.Exit");
    }

    void showMenu2() {
        System.out.println("---Select type of Square Triangle---");
        System.out.println("1.Bottom-left");
        System.out.println("2.Top-left");
        System.out.println("----------");
        System.out.println("0.Back");
    }

    public static void main(String[] args) {
        int choice = 100;
        App app = new App();
        try (Scanner scanner = new Scanner(System.in)) {
            while (choice != 0) {
                app.showMenu();
                choice = scanner.nextInt();
                switch (choice) {
                    case 0:
                        System.exit(0);
                    case 1:
                        Rectangle rec = new Rectangle(8, 4);
                        rec.draw();
                        break;
                    case 2:
                        int choice2 = 100;
                        while (choice2 != 0) {
                            SquareTriangle sqTriangle = new SquareTriangle(9, 9);
                            app.showMenu2();
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 0:
                                    app.showMenu();
                                    break;
                                case 1:
                                    sqTriangle.drawBottomLeft();
                                    break;
                                case 2:
                                    sqTriangle.drawTopLeft();
                                    break;
                                default:
                                    System.out.println("Invalid option");
                            }
                        }
                        break;
                    case 3:
                        IsoscelesTriangle islTriangle = new IsoscelesTriangle(11,6);
                        islTriangle.draw();
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }
    }
}

