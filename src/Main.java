
public class Main {

    static final int PASS_MARK = 50;

    public static void main(String[] args) {
        int[][] marks = {
                {80, 70, 90},
                {40, 50, 30},
                {30, 90, 44}
        };
        for (int i = 0; i < marks.length; i++) {
            double average = calculateAverage(marks[i]);
            if (average >= PASS_MARK) {
                System.out.println("Student " + (i + 1)+ ": Average = " + average + ", Pass");
            } else {
                System.out.println("Student " + (i + 1)+ ": Average = " + average + ", Fail");
            }
        }
    }

    static double calculateAverage(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.length;
    }
}
