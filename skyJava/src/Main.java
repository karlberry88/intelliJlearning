import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello!");

        //(Primitive, Class) (Pass-by-value, Pass-by-reference)
        int myNumber = 5;
        myNumber = myNumber +2;

        System.out.println(myNumber);

        if (myNumber > 10) {
            System.out.println("Greater than ten");
        } else if (myNumber > 5) {
            System.out.println("Greater than five");
        }else if (myNumber ==1 || (myNumber < 0 && myNumber > -50)){
            System.out.println("Combined");
        }else{
            System.out.println(myNumber);

        }
        switch (myNumber){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println(myNumber);
                break;
        }
myNumber =-5;
        while (myNumber > 0 ){
            System.out.println(myNumber);
            myNumber = myNumber -1 ;
        }
        do{
            System.out.println(myNumber);
            myNumber = myNumber -1;
        }while (myNumber >0);

        for (int i =0; i<=10; i++){
            System.out.println(i);
        }

        myNumber =1 ;  // = 1
        myNumber++;       // =2
        myNumber = myNumber +3;  //=5
        myNumber += 2;      // = 7

        myNumber--;
        myNumber = myNumber -2;
        myNumber -= 3;


        myNumber /= 4; // 1/1.01=0.99 =0
        myNumber *= 4;//0*4 =0

        System.out.println(myNumber);

    }

}

// primative data types cant be broken down any futher
// double 64 bits
//float    32 bits

//long  64 bits         signed
//int   32 bits         signed
//short 16 bits         signed

//byte  8 bits   signed
//char  16 bits  Unicode

//boolean   1 bit

// Non primitve
//Strings
//Vectors
//Points
//Main
//Scanners
/*
 Scanner s = new Scanner(System.in);
System.out.println(s.next());
myNumber = 2.nextInt();

if (myNumber % 2 == 0){
        System.out.println("Even")
} else{
    System.out.println("Odd")}
*/


/*
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i); \*

 */

