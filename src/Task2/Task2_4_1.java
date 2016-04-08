package Task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by koryak on 04.04.2016.
 */
public class Task2_4_1 {
    public static void main(String args[]) {
        int i = 0;
        System.out.println("Введите целые числa через пробел:");
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        first:
        {
            for (String num : nums) {
                byte[] a = num.getBytes();
                Arrays.sort(a);
                if (a[i] == a[a.length - 1]) {
                    System.out.println("Искомое число " + num);
                    break first;
                }
            }
            {
                for (String num : nums) {
                    byte[] a = num.getBytes();
                    Arrays.sort(a);
                    if (a[i] == a[a.length - 2]) {
                        System.out.println("Искомое число " + num);
                        break first;
                    }
                }
                {
                    for (String num : nums) {
                        byte[] a = num.getBytes();
                        Arrays.sort(a);
                        if (a[i] == a[a.length - 3]) {
                            System.out.println("Искомое число " + num);
                            break first;
                        }
                    }
                    {
                        for (String num : nums) {
                            byte[] a = num.getBytes();
                            Arrays.sort(a);
                            if (a[i] == a[a.length - 4]) {
                                System.out.println("Искомое число " + num);
                                break first;
                            }
                        }
                        {
                            for (String num : nums) {
                                byte[] a = num.getBytes();
                                Arrays.sort(a);
                                if (a[i] == a[a.length - 5]) {
                                    System.out.println("Искомое число " + num);
                                    break first;
                                }
                            }
                            {
                                for (String num : nums) {
                                    byte[] a = num.getBytes();
                                    Arrays.sort(a);
                                    if (a[i] == a[a.length - 6]) {
                                        System.out.println("Искомое число " + num);
                                        break first;
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }

    }}