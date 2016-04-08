package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 06.04.2016.
 */
public class Task2_9_1_Line {
    public static void main(String[] args) {
        int n;
        System.out.print("Введите количество строк и столбцов в матрице N*N: ");
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
        System.out.println("Матрица с упорядоченными по возрастанию строками: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (twoDim[i][j] > twoDim[i][k]) {
                        int tmp = twoDim[i][j];
                        twoDim[i][j] = twoDim[i][k];
                        twoDim[i][k] = tmp;
                    }
                }

                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
    }}