//Michael Butera's Calculator exercise
//2022 2 7

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNum = scanner.nextInt();

        System.out.println("Select Option:\n" +
                "1 - Add\n" +
                "2 - Subtract\n" +
                "3 - Multiply\n" +
                "4 - Divide");
        int operator = scanner.nextInt();

        switch(operator) {
            case 1:
                answer = firstNum + secondNum;
                break;
            case 2:
                answer = firstNum - secondNum;
                break;
            case 3:
                answer = firstNum * secondNum;
                break;
            case 4:
                if(secondNum == 0) {
                    System.out.println("Cannot divide by 0");
                    break;
                }
                answer = firstNum / secondNum;
                break;
            default:
                System.out.println("Invalid operator. Press 1, 2, 3, or 4 to select operator.");
        }

        System.out.println("Result: " + answer);
    }
}
