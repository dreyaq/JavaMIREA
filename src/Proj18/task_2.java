package Proj18;
import java.util.Scanner;
public class task_2 {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            int b = (2/i);
            System.out.println(2./i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter an integer.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
        finally
        {
            System.out.println("Finally case");
        }
    }

    public static void main(String[] args) {
        task_2 example = new task_2();
        example.exceptionDemo();
    }
}
