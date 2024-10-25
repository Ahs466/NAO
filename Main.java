import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args) {
        Scanner requestNum = new Scanner(System.in);
        System.out.printf("Insert number!");  // Import the Scanner class
        int upperLimit = requestNum.nextInt();
        for(int i = 0; i < upperLimit;i++){
            System.out.printf("%s: ", i);
            if(i % 3 == 0){
                System.out.printf("Fizz");
            }
            if(i % 5 == 0){
                System.out.printf("Buzz");
            }
            System.out.printf("\n");
        }
    }
}
