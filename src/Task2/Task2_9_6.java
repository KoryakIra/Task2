package Task2;

import java.util.Scanner;

/**Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
 * Created by koryak on 18.04.2016.
 */
public class Task2_9_6 {
    public static void main(String[] args) {
        int n, p, neg;
        double sum = 0, sum1;

        System.out.print("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
        double sum2[]=new double[n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                twoDim[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
        System.out.println("Матрица, разбитая по строкам:" );

            for (int i = 0; i < n; i++) {
                sum1 = 0;
                for (int j = 0; j < n; j++) {
                    System.out.print(twoDim[i][j] + " ");

                    sum = sum + twoDim[i][j];
                    sum1 = sum1 + twoDim[i][j];
                }
                System.out.println();
                System.out.println("Сумма "+(i+1)+"-ой строки: " + sum1);
                System.out.println("Среднее арифметическое строки:" +sum1/n);
                sum2[i]=sum1;
            }
            System.out.println("Сумма всех членов матрицы: " + sum);
        System.out.println("Среднее арифметическое матрицы:" +sum/(n*n));
        System.out.println("Новая матрица с вычетом среднего арифметического всей матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((twoDim[i][j]-sum/(n*n)) + " ");
            System.out.println();
        }
        System.out.println("Новая матрица с вычетом среднего арифметического строки матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((twoDim[i][j]-sum2[i]/n) + " ");
            System.out.println();
        }
    }
}
