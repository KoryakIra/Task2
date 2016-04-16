package Task2;

        import java.util.Scanner;

/**
 * Created by koryak on 14.04.2016.
 */
public class Task2_9_4 {
    public static void main(String[] args) {
        int n, p,neg, sum ;
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
        for (int i = 0; i < n; i++) {p=0;sum = 0;neg=0;
            System.out.println("Сумма элементов матрицы, расположенных между первым и вторым положительными элементами  " + (i + 1) + "-ой строки: ");

            first:
            {
                for (int j = 0; j < n - 1; j++)
                    second:
                            {
                                if (twoDim[i][j] > 0) {p++;
                                    if (twoDim[i][j + 1] <= 0) {
                                        for (int k = j + 1; k < n; k++) {
                                            if (twoDim[i][k] <= 0) {
                                                sum = sum + twoDim[i][k];
                                                neg++;
                                            }
                                            if (twoDim[i][k] > 0) {
                                                System.out.print(sum + " ");
                                                break first;
                                            }else if ((neg == n-1)&&(p==1)){System.out.println("В это строке только один положительный элемент");
                                                break first;
                                        }
                                        }
                                    }
                                    else {
                                        if ((neg == n-1)&&(p==1)){System.out.println("В это строке только один положительный элемент");
                                            break first;
                                        }
                                        System.out.println(sum + " ");
                                        break first;
                                    }


                                } else {
                                    neg++;
                                    if ((neg == n-1)&&(p==1)) {
                                        System.out.println("В это строке только один положительный элемент");
                                        break first;
                                    }
                                    if (neg == n) {
                                        System.out.println("В это строке нет положительных элементов");
                                        break first;
                                    }

                                    else break second;
                                }
                            }

            }
            System.out.println();
        }
    }
}