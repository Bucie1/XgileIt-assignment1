//importing calculate class
import calculatorpackage.Calculate;
//importing the scanner class
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 //creating objects
        Calculate calculateObj = new Calculate();
          Scanner scan = new Scanner(System.in);

          int num1;
          int num2;
          String operand;


//getting user input
        System.out.println("Enter your first number");
        num1 = scan.nextInt();
        System.out.println("Enter your operator");
        operand= String.valueOf(scan.next());
        System.out.println("Enter your second number");
        num2 = scan.nextInt();


//calling the method from the other package
        calculateObj.calculations(num1,operand,num2);



    }
}