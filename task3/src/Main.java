// Реализовать простой калькулятор

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число:\n");
        double a = iScanner.nextDouble();
        System.out.printf("Введите второе число:\n");
        double b = iScanner.nextDouble();
        System.out.printf("Сложение - введите '1'\nВычитание - введите '2'\nУмножение - введите '3'\nДеление - введите '4'\n");
        int choice = iScanner.nextInt();
        if (choice == 1)
        {
            System.out.printf("%f + %f = %f", a, b, Sum(a, b));
        }
        else if (choice == 2)
        {
            System.out.printf("%f * %f = %f", a, b, Sub(a, b));
        }
        else if (choice == 3)
        {
            System.out.printf("%f * %f = %f", a, b, Mult(a, b));
        }
        else if (choice == 4)
        {
            System.out.printf("%f * %f = %f", a, b, Div(a, b));
        }
        else
        {
            System.out.println("Такого варианта нет");
        }
        iScanner.close();
    }

    public static double Sum(double a, double b)
    {
        return a + b;
    }

    public static double Sub(double a, double b)
    {
        return a - b;
    }

    public static double Mult(double a, double b)
    {
        return a * b;
    }

    public static double Div(double a, double b)
    {
        return a / b;
    }
}
