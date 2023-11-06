import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int catCount = 3;
//        int bigCar = 4;
//        int smallCar = 5;
//        String s = "Hello";
//        char g = '2';
//        char d = '%';
//        int x = 10;
//        double var = 1.5;
//        System.out.println(a + "\n" + b + "\n" + catCount + "\n" + bigCar + "\n" + smallCar + "\n" + s + "\n"
//        + g + "\n" + d + "\n" + x + "\n" + var);

        System.out.println("\t\t\t****Добро пожаловать в калькулятор умножения****");
        System.out.println("Введите первое число: ");
        double a = new Scanner (System. in).nextDouble();
        System.out.println("Введите второе число: ");
        double b = new Scanner (System. in).nextDouble();
        System.out.println(a + " * " + b + " = " + (a * b));

        System.out.println("\t\t\t****Добро пожаловать в калькулятор деления****");
        System.out.println("Введите первое число: ");
        double x = new Scanner (System. in).nextDouble();
        System.out.println("Введите второе число: ");
        double y = new Scanner (System. in).nextDouble();
        System.out.println(x + " / " + y + " = " + (x / y));

        System.out.println("\t\t\t****Добро пожаловать в калькулятор сложения****");
        System.out.println("Введите первое число: ");
        double w = new Scanner (System. in).nextDouble();
        System.out.println("Введите второе число: ");
        double e = new Scanner (System. in).nextDouble();
        System.out.println(w + " + " + e + " = " + (w + e));

        System.out.println("\t\t\t****Добро пожаловать в калькулятор вычитания****");
        System.out.println("Введите первое число: ");
        double r = new Scanner (System. in).nextDouble();
        System.out.println("Введите второе число: ");
        double t = new Scanner (System. in).nextDouble();
        System.out.println(r + " - " + t + " = " + (r - t));



    }
}
