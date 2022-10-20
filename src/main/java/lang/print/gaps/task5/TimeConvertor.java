package lang.print.gaps.task5;

public class TimeConvertor {

    public static void main(String[] args) {

        convert(2);
    }

    private static void convert(float minutes) {
        float seconds;
        System.out.println(minutes + " minutes equals " + (seconds = minutes * 60) + " seconds");

    }
}