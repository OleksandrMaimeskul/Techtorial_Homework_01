import java.util.Scanner;

public class TASK5_OPTION2 {
    public static void main(String[] args) {

        int averageScoreRequired = 65, classAttendanceRequired = 80;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first exam score: ");
        int firstExamScore = scanner.nextInt();
        double firstExam20 = firstExamScore * 0.2;

        System.out.println("Please enter your second exam score: ");
        int secondExamScore = scanner.nextInt();
        double secondExam30 = secondExamScore * 0.3;
        System.out.println("Please enter your third exam score: ");
        int thirdExamScore = scanner.nextInt();
        double thirdExam50 = thirdExamScore * 0.5;
        double averageScoreOfOwn = firstExam20 + secondExam30 + thirdExam50;
        System.out.println("Please enter your class attendance in % of full year: ");
        int yourClassAttendance = scanner.nextInt();
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
