import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    System.out.println("Please Enter A Number:");
    int num1 = scan.nextInt();
    System.out.println("Please Enter Another Number");
    int num2 = scan.nextInt();

    System.out.println("Please Choose An Operator From +,-,/,*,%,^");
    String operator = scan.next();
   switch (operator) {
       case "-":
           System.out.println(num1-num2);
           break;
       case "+":
           System.out.println(num1+num2);
           break;
       case "*":
           System.out.println(num1*num2);
           break;
       case "/":
           System.out.println(num1*num2);
           break;
       case "%":
           System.out.println(num1%num2);
           break;
       case "^":
           System.out.println(Math.pow(num1,num2));
           break;
       default:
           System.out.println("Please Enter a Valid Input");
   }



    }
}
