import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nadmorskaVisina = sc.nextDouble();
        System.out.printf("nadmorska visina = %.2f , gravitacijski pospesek = %.2f", nadmorskaVisina, izracun(nadmorskaVisina));
    }
    public static double izracun(double v) {
        final double C = 6.674 * Math.pow(10, -11);
        final double M = 5.972 * Math.pow(10, 24);
        final double r = 6.371 * Math.pow(10, 6);
        int a = 0;
        return (C*M)/((r+v)*(r+v));
    }
}