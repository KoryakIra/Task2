package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 06.04.2016.
 */
public class Task2_8_1 {
    public static void main(String []args){
        int k,n,r=1;
        System.out.println("Введите число, квадратный корень которого является целое число");
        Scanner scan= new Scanner(System.in);
        k=scan.nextInt();
        n=(int)Math.sqrt(k);
        int twoDim[][] = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++){
                twoDim[i][j]=r;
                r++;}
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                System.out.print(twoDim[i][j]+" ");
            System.out.println();
        }

    }
}
