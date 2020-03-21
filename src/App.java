import java.util.Scanner;

public class App {
    public static final String INVALID_STRING = "Invalid option";
    public static final int EXIT_CODE_OK = 0;
    public static final int OPTION_1 = 1;
    public static final int OPTION_2 = 2;
    public static final int OPTION_3 = 3;
    static int inputWidth;
    static int inputHeight;
    static int choice=100;
    Scanner scanner = new Scanner(System.in);

    private static boolean isExit() {
        return choice != EXIT_CODE_OK;
    }
    void showMenu() {
        System.out.println("----------MENU-------------");
        System.out.println("1.Print rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("---------------------------");
        System.out.println("0.Exit");
        System.out.println("---------------------------");
    }

    void showMenu2() {
        System.out.println("---Select type of Square Triangle---");
        System.out.println("1.Bottom-left");
        System.out.println("2.Top-left");
        System.out.println("------------------------------------");
        System.out.println("0.Back");
        System.out.println("------------------------------------");
    }
    void showInputForm(){
        System.out.println("Enter width:");
        inputWidth = scanner.nextInt();
        System.out.println("Enter height:");
        inputHeight = scanner.nextInt();
    }
    public static void main(String[] args) {

        App app = new App();

        try (Scanner scanner = new Scanner(System.in)) {
            while (isExit()) {
                app.showMenu();
                choice = scanner.nextInt();
                switch (choice) {
                    case EXIT_CODE_OK:
                        System.exit(EXIT_CODE_OK);
                    case OPTION_1:
                        app.showInputForm();
                        Rectangle rec = new Rectangle(inputWidth, inputHeight);
                        rec.draw();
                        break;
                    case OPTION_2:
                        app.showInputForm();
                        while (isExit()) {
                            SquareTriangle sqTriangle = new SquareTriangle(inputWidth, inputHeight);
                            app.showMenu2();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case EXIT_CODE_OK:
                                    app.showMenu();
                                    break;
                                case OPTION_1:
                                    sqTriangle.drawBottomLeft();
                                    break;
                                case OPTION_2:
                                    sqTriangle.drawTopLeft();
                                    break;
                                default:
                                    System.out.println(INVALID_STRING);
                            }
                        }
                        break;
                    case OPTION_3:
                        app.showInputForm();
                        IsoscelesTriangle islTriangle = new IsoscelesTriangle(inputWidth, inputHeight);
                        islTriangle.draw();
                        break;
                    default:
                        System.out.println(INVALID_STRING);
                }
            }
        }
    }
}

