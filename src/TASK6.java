import java.util.Scanner;

public class TASK6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredSteps = 10_000, maxCaloriesPerDay = 1500;
        double requiredMiles = 4.0;

        System.out.println("Let's help to David lose 10kg per one month.");

        System.out.println("Please enter amount of steps per last day: ");
        int stepsCount = scanner.nextInt();

        System.out.println("Please enter how many miles you walk/ran per last day: ");
        double milesCount = scanner.nextDouble();

        System.out.println("Please enter amount of calories you spent per last day: ");
        int caloriesCount = scanner.nextInt();

        boolean isLoseOrNot = (stepsCount >= requiredSteps || milesCount >= requiredMiles)
                && caloriesCount <= maxCaloriesPerDay;
        System.out.println("Daily Steps is " + stepsCount);
        System.out.println("Daily Run is " + milesCount);
        System.out.println("Daily calories is " + caloriesCount);
        System.out.println("Can David lose 10 kg in month? " + isLoseOrNot);
    }
}
