import java.util.Scanner;
public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volume = sc.nextDouble();
        double r = sc.nextDouble();
        double power = volume * volume / r;
        System.out.println(power);

        double dBm = 10 * Math.log10(power) + 30;
        System.out.println(dBm);
    }
}
