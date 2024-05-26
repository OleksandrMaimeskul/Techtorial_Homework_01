import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter even number: ");
        int evenNumber = scanner.nextInt();
        boolean trueThisIsEvenNumber = evenNumber %2 == 0;
        System.out.println(evenNumber +" is even number: "+ trueThisIsEvenNumber);
    }
}
