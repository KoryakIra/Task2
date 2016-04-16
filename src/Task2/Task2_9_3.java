package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 14.04.2016.
 */
public class Task2_9_3 {
    public static void main(String[] args) {
        int n,l=0;
        System.out.print("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
        int arr1[] = new int[n*n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                twoDim[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
                arr1[l]=twoDim[i][j];//преобразуем матрицу из двумерного в одномерный массив
                l++;
            }
        //вывод матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
        //вывод массива
        System.out.println("Одномерный массив: ");
        for(l = 0; l<n*n; l++) {
            System.out.print(arr1[l] + " ");
        }
        System.out.println();

        System.out.println("Элементы матрицы идущие подряд по возрастанию: ");
        for(l = 0; l<n*n-1; l++)
            if ((arr1[l] < arr1[l+1]) && (arr1[l+1] - arr1[l] == 1)) {
                System.out.println(arr1[l] + " " + arr1[l+1]);
            }
        System.out.println();
        System.out.println("Элементы матрици идущие подряд по убыванию: ");
        for(l = 0; l<n*n-1; l++)
            if ((arr1[l] > arr1[l+1]) && (arr1[l] - arr1[l+1] == 1)) {
                System.out.println(arr1[l] + " " + arr1[l+1]);


            }
    }
}
