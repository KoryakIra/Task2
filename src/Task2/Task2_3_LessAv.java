package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 31.03.2016.
 */
public class Task2_3_LessAv {
        public static void main(String[]args){
            int n;
            System.out.println("Введите n");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            //создание массива чисел(строк)
            String[] nums = new String[n];
            Scanner scan2 = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                System.out.println("Введите " + (i + 1) + "-ый элемент массива:");
                nums[i] = scan2.nextLine();}
//сортировка по возрастанию длины чисел
            for (int i=0;i<nums.length;i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i].length() > nums[j].length()) {
                        String tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
            //вывод чисел с длинной меньше среднего
            int maxlength=nums[n-1].length(), minlength=nums[0].length();
            int avlength=(maxlength + minlength)/2;
            System.out.println("Числа, длина которых меньше средней:");
            for (int i=0;i<nums.length;i++) {
                if (nums[i].length()<avlength){
                System.out.print(nums[i] + " ");
                System.out.print(" ");
                System.out.println("его длина равна " + nums[i].length());}
        }
    }}

