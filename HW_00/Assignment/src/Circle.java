
public class Circle {
    static double p = 3.14;

    public static double calcSide(int r) {
        return r * r * p;
    }

    public static double calcCirc(int r) {
        return 2 * p * r;
    }

    public static void main(String[] args) {
        System.out.println(Circle.calcSide(5)); // 78.5
        System.out.println(Circle.calcCirc(5)); // 3.14 * 10
    }
}
