package lang.print.gaps.task5;

public class NumberDivider {

    public static void main(String[] args) {
        divide(9);
    }
    static void divide(double toBeDivided) {
        double devidedByFiveNumber;
        System.out.println(toBeDivided + " devided by 5 equals " + (devidedByFiveNumber = toBeDivided/5));
    }
}
