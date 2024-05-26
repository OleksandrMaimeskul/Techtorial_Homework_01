import java.util.Scanner;

public class TASK5_OPTION2 {
    public static void main(String[] args) {

        int averageScoreRequired = 65, classAttendanceRequired = 80;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your class attendance in % of full year: ");
        int yourClassAttendance = scanner.nextInt();

        System.out.println("Please enter your first exam score: ");
        int firstExamScore = scanner.nextInt();

        System.out.println("Please enter your second exam score: ");
        int secondExamScore = scanner.nextInt();

        System.out.println("Please enter your third exam score: ");
        int thirdExamScore = scanner.nextInt();

        int averageScoreOfOwn = (firstExamScore + secondExamScore + thirdExamScore) / 3;
        boolean ifBothCriteriaSatisfied = yourClassAttendance >= classAttendanceRequired &&
                averageScoreOfOwn >= averageScoreRequired;
        System.out.println("exam1 = " + firstExamScore);
        System.out.println("exam2 = " + secondExamScore);
        System.out.println("exam3 = " + thirdExamScore);
        System.out.println("attendance = " + yourClassAttendance);
        System.out.println("Can I pass the class?  "
                + ifBothCriteriaSatisfied);

    }
}
