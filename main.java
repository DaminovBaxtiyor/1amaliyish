import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uchta qarshilikni kiriting:");
        int R1 = scanner.nextInt();
        int R2 = scanner.nextInt();
        int R3 = scanner.nextInt();

        System.out.println("Parallel qarshilik: " + parallelResistance(R1, R2, R3));
    }

    // Parallel qarshilikni hisoblash uchun funksiya
    public static double parallelResistance(int R1, int R2, int R3) {
        double parallel = 1 / ((1.0 / R1) + (1.0 / R2) + (1.0 / R3));
        return parallel;
    }
}
