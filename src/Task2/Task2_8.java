package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 06.04.2016.
 */
public class Task2_8 {
    public static void main(String[] args) {
        int n,k=1;
        System.out.println("Введите количество строк и столбцов в матрице");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int twoDim[][] = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++){
                twoDim[i][j]=k;
                k++;
            }

            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++)
                    System.out.print(twoDim[i][j]+" ");
                System.out.println();
                }
        }}

