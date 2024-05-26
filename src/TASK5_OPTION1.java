
public class TASK5_OPTION1 {
    public static void main(String[] args) {
        int firstExamScore = 20, secondExamScore = 30, thirdExamScore = 50;
        int averageScoreRequired = 65, classAttendanceRequired = 80;
        int yourClassAttendance = 80;
        int averageScoreOfOwn = (firstExamScore + secondExamScore + thirdExamScore) / 3;
        boolean ifBothCriteriaSatisfied = yourClassAttendance >= classAttendanceRequired &&
                averageScoreOfOwn >= averageScoreRequired;
        System.out.println("exam1 = " + firstExamScore);
        System.out.println("exam2 = " + secondExamScore);
        System.out.println("exam3 = " + thirdExamScore);
        System.out.println("attendance = " + yourClassAttendance);
        System.out.println("Can I pass the class?  "+ ifBothCriteriaSatisfied);

    }
}

