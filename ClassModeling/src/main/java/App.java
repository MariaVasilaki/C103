import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        menuSelection();

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                //operandSelection1();
                System.out.println(SimpleCalculator.addition(operandSelection1(),operandSelection2()));

                break;
            case 2:
                System.out.println(SimpleCalculator.subtraction(operandSelection1(),operandSelection2()));
                //menuSelection();
                break;
            case 3:
                System.out.println(SimpleCalculator.multiplication(operandSelection1(),operandSelection2()));
                //menuSelection();
                break;
            case 4:
                System.out.println(SimpleCalculator.division(operandSelection1(),operandSelection2()));
                //menuSelection();
                break;
            case 5:
                System.out.println("-------Goodbye!Thanks for joining us!-------");
            default:
                menuSelection();
        }


    }

    private static void menuSelection() {
        System.out.println("Please select one of the following choices:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    static int operandSelection1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give first operand");
        int o1 = sc.nextInt();
        return o1;
    }

    static int operandSelection2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give second operand");
        int o2 = sc.nextInt();
        return o2;
    }


}
