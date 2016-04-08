package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 07.04.2016.
 */
public class Task2_9_2_Right {
    public static void main(String[] args) {
    int n,k;
    System.out.print("Введите количество строк и столбцов в матрице ");
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    int twoDim[][] = new int[n][n];
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
        System.out.print("Введите величину сдвига k ");
        k=scan.nextInt();
    System.out.println("Матрица сo сдвигом вправо на "+k);

    for (int i = 0;i<n; i++) {
        for (int j=0;j<k;j++ )
System.out.print(twoDim[i][n-k+j] + " ");
        for (int j=k;j< n; j++)
            System.out.print(twoDim[i][j-k] + " ");
        System.out.println();
    }
}}

