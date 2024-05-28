
public class TASK5_OPTION1 {
    public static void main(String[] args) {
        int firstExamScore = 80, secondExamScore = 80, thirdExamScore = 80;
        int averageScoreRequired = 65, classAttendanceRequired = 80;
        double firstExam20 = firstExamScore * 0.2;
        double secondExam30 = secondExamScore * 0.3;
        double thirdExam50 = thirdExamScore * 0.5;
        int yourClassAttendance = 80;
        double averageScoreOfOwn = firstExam20 + secondExam30 + thirdExam50;
        boolean ifBothCriteriaSatisfied = yourClassAttendance >= classAttendanceRequired &&
                averageScoreOfOwn >= averageScoreRequired;
        System.out.println("exam1 = " + firstExamScore);
        System.out.println("exam2 = " + secondExamScore);
        System.out.println("exam3 = " + thirdExamScore);
        System.out.println("attendance = " + yourClassAttendance);
        System.out.println("Can I pass the class?  "+ ifBothCriteriaSatisfied);

    }
}

