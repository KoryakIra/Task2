package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 06.04.2016.
 */
public class Task2_9 {

    public static void main(String[] args) {
        int n;
        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int twoDim[][] = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++){
                twoDim[i][j]=(int)(Math.random()*2*(n+1)-(n+1));
            }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                System.out.print(twoDim[i][j]+" ");
            System.out.println();
        }
}}
