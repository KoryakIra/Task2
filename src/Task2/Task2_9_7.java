package Task2;

import java.util.Scanner;

/**В новой матрице отсутствуют нули
 * Created by koryak on 18.04.2016.
 */
public class Task2_9_7 {
    public static void main(String[] args) {
        int n;

        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
        int m = n;
        int l = n;
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < l; i++)
            for (int j = 0; j < m; j++) {
                twoDim[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
        //Удаляем лишние строки
        for (int i = 0; i < l; i++) {
            int tmp = 0;
            for (int j = 0; j < m; j++)
                if (twoDim[i][j] == 0)
                    tmp = 1;
            if (tmp == 1) {
                for (int z = i; z < (l - 1); z++)
                    for (int j = 0; j < m; j++)
                        twoDim[z][j] = twoDim[z + 1][j];
--i;
              --l;

            }
        }
       /*for (int j = 0; j <m; j++) {
            int tmp = 0;
            for (int i = 0; i < l; i++)
                if (twoDim[i][j] == 0)
                    tmp = 1;


            if (tmp == 1) {
                for (int z = j; z < (m - 1); z++)
                    for (int i = 0; i < l; i++)
                        twoDim[i][z] = twoDim[i][z + 1];
--j;
                  --m;
                }
            }*/
        System.out.println("Уплотненная матрица: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
            }

        }
    }



