
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи x: ");
        double x = in.nextDouble();

        System.out.println("Введи a: ");
        double a = in.nextDouble();

        System.out.println("Введи b: ");
        double b = in.nextDouble();

        Сalculator ExampleOne = new Сalculator();
        Сalculator ExampleTwo = new Сalculator();
        Сalculator ExampleThree = new Сalculator();

        ExampleOne.one(x);
        ExampleTwo.two(a, b);
        ExampleThree.three(x, a, b);
    }
}

class Сalculator {
    public void one(double x) {
        double answer = 3 * x + 5;
        System.out.println("Первое уравнения: " + answer);
    }

    public void two(double a, double b) {
        if (a != b) {
            double answer = (a + b) / (a - b);
            System.out.println("Второе уравнения: " + answer);
        } else {
            System.out.println("делить на ноль нельзя!");
        }
    }

    public void three(double x, double a, double b) {
        if (b != 0) {
            double temp = a * x / b;
            int num = (int)temp;
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }
            System.out.println("Третье уравнения: " + result);
        } else {
            System.out.println("b не должен быть нулем!");
        }
    }
}