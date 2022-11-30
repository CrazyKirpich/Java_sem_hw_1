// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число:\n");
        int num = iScanner.nextInt();
        System.out.printf("Чтобы посчитать сумму - введите '1'\nЧтобы посчитать произведение - введите '2'\nВведите число:\n");
        int choice = iScanner.nextInt();
        if (choice == 1)
        {
            System.out.printf("Сумма чисел от 1 до %d:\n%d", num, Sum(num));
        }
        else if (choice == 2)
        {
            System.out.printf("Произведение чисел от 1 до %d:\n%d", num, Mult(num));
        }
        else
        {
            System.out.println("Такого варианта нет");
        }
        iScanner.close();
    }

    public static int Sum(int num)
    {
        int result = 0;
        for (int i = 1; i <= num; i++)
        {
            result += i;
        }
        return result;
    }

    public static int Mult(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else
        {
            int result = 1;
            for (int i = 1; i <= num; i++)
            {
                result *= i;
            }
            return result;
        }
    }
}
