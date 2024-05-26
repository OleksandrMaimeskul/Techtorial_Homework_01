import java.util.Scanner;

public class TASK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter odd number: ");
        int oddNumber = scanner.nextInt();
        boolean trueThisIsOddNumber = oddNumber %1 == 0 && oddNumber %2 != 0 ;
        System.out.println(oddNumber + " is odd number: "+ trueThisIsOddNumber);
    }
}
