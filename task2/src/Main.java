// Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите до какого числа выводить простые числа?\n");
        int num = iScanner.nextInt();
        PrintSimpleDigits(num);
        iScanner.close();
    }

    public static void PrintSimpleDigits(int num)
    {
        for (int i = 2; i <= num; i++)
        {
            if (IsSimple(i))
            {
                System.out.println("i = " + i);
            }
        }
    }

    public static boolean IsSimple(int x)
    {
        for (int i = 2; i < x; i++)
        {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}