//created a package
package calculatorpackage;


//created a class using the correct name conversion for a class
public class Calculate {

    //showcasing the access modifier
    private int num1;
    private int num2;
    private String operator;

    //creating a constructor and making it public so that it can be accessed by the main class package
 public Calculate(){
     //showing that when u have a constructor for it to work it either calls super() but in this case it called this()
     this.num1 =1;
     this.num2 =2;
     this.operator="-";
 }

//created a public void method
    public void calculations(int num1, String operator, int num2) {


        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }




        }



}
