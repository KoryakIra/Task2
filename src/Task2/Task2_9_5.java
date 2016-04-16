package Task2;

import java.util.Scanner;

/**
 * Created by 111 on 15.04.2016.
 */
public class Task2_9_5 {
    public static void main(String[] args) {
        int n;
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
        System.out.println("Матрица повернутая на 90 градусов против часовой стрелки:");
        for (int j = n-1; j >=0; j--) {
            for (int i = 0; i <n; i++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
        System.out.println("Матрица повернутая на 180 градусов против часовой стрелки:");
        for (int i = n-1; i>=0; i--) {
            for (int j = n-1; j >=0; j--)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
        System.out.println("Матрица повернутая на 270 градусов против часовой стрелки:");
        for (int j = 0; j < n; j++) {
            for (int i = n-1; i >=0; i--)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }

    }}