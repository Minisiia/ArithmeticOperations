import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть а");
        double a = scanner.nextDouble();
        System.out.println("Введіть b");
        double b = scanner.nextDouble();
        double addition = a + b;
        System.out.println("a + b = " + addition);
        double subtraction = a - b;
        System.out.println("a - b = " + subtraction);
        double multiplication = a * b;
        System.out.println("a * b = " + multiplication);
        double division = a / b;
        System.out.println("a / b = " + division);
        double modulus = a % b;
        System.out.println("a % b = " + modulus);
        double incrementA = ++a; // для наглядності роботи використовується префіксний інкремент
        System.out.println("increment a = " + incrementA);
        double incrementB = ++b;
        System.out.println("increment b = " + incrementB);
        double decrementA = --a;
        System.out.println("decrement a = " + decrementA);
        double decrementB = --b;
        System.out.println("decrement b = " + decrementB);
    }
}
