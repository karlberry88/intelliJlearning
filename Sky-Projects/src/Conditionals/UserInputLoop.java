package Conditionals;
import java.util.Scanner;
public class UserInputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println("the bigger number is: " + num1);
            } else if (num2 > num1) {
                System.out.println("the bigger number is: " + num2);
            } else {
                System.out.println("both numbers are equal.");
            }
            System.out.print("enter colour (green,yellow,red): ");
            String color = scanner.next().toLowerCase();

            switch (color) {
                case "green":
                    System.out.println("green means go.");
                    break;
                case "yellow":
                    System.out.println("yellow means slow down.");
                    break;
                case "red":
                    System.out.println("red means stop.");
                    break;
                default:
                    System.out.println("invalid colour entered.");
                    break;
            }

    }
}
/*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter  number between 1 and 12 representing month: ");
        int monthNum = scanner.nextInt();
              String season;
        switch (monthNum) {
            case 1: case 2: case 12:
                season = "Winter";
                break;
            case 3: case 4: case 5:
                season = "Spring";
                break;
            case 6: case 7:  case 8:
                season = "Summer";
                break;
            case 9: case 10: case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }
         if (season.equals("Invalid month")) {
            System.out.println("Invalid number Please enter a number between 1 and 12 ");
        } else {
            System.out.println("The season is: " + season);
        }
  */