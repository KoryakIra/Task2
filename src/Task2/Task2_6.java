package Task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by koryak on 04.04.2016.
 */
public class Task2_6 {
    public static void main(String args[]) {
        System.out.println("Введите целые числа через пробел");
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        for (String num : nums) {
            byte[] a = num.getBytes();
            byte[] b = num.getBytes();
            Arrays.sort(b);
            if (Arrays.equals(a,b)){
                System.out.println("Искомое число: " + num);
                break;}}}
}
