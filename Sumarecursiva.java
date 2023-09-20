package Sumarecursiva;
import java.util.Scanner;

public class Sumarecursiva {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresar el valor del limite inferior:");
            int limit_i = scanner.nextInt();

                System.out.println("Ingresar el valor del limite superior:");
                int limit_s = scanner.nextInt();

            int sumatoria = calcSuma(limit_i, limit_s);

            System.out.println("La sumatoria de los cuadrados es: " + sumatoria);
        }
    }

    private static int calcSuma(int limit_i, int limit_s) {
        if (limit_i > limit_s) {
            return 0;
        } else {
            int cuadrado = limit_i * limit_i;
            return cuadrado + calcSuma(limit_i + 1, limit_s);
        }
    }
}
