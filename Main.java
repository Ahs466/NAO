import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args) {
//        Scanner requestNum = new Scanner(System.in);
//        System.out.printf("Insert number!");  // Import the Scanner class
//        int upperLimit = requestNum.nextInt();
//        for(int i = 0; i < upperLimit;i++){
//            System.out.printf("%s: ", i);
//            if(i % 3 == 0){
//                System.out.printf("Fizz");
//            }
//            if(i % 5 == 0){
//                System.out.printf("Buzz");
//            }
//            System.out.printf("\n");

        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Please input number 1: ");
        int num1 = scannerObject.nextInt();
        System.out.print("Please input number 2: ");
        int num2 = scannerObject.nextInt();
        if (num1 > 21 && num2 > 21) {
            System.out.println("Both are greater than 21!");
        }
        else {
            if (num1 < num2) {
                if (num2 <= 21)
                    System.out.printf("%s wins!", num2);
                else
                    System.out.printf("%s wins!", num1);
            }
            else if (num2 < num1) {
                if (num1 <= 21)
                    System.out.printf("%s wins!", num1);
                else
                    System.out.printf("%s wins!", num2);
            }
            else {
                System.out.println("Both are equal");
            }
        }
    }
}
