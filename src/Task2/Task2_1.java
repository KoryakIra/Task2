package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 30.03.2016.
 */
public class Task2_1 {
    public static void main(String[]args){
        String max=null,min=null;
        int maxl=0,minl=10,n;
        System.out.println("Введите n");
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        int []nums=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("Введите "+(i+1)+"-ый элемент массива:");
            String num=scan.next();

            if (minl>num.length()) {
                minl = num.length();
                min = num;
            }
            if (maxl<num.length()) {
                maxl = num.length();
                max = num;}



        }System.out.println("Минимальное число "+min+" состоит из "+minl+" цифр."+
                " \nМаксимальное число "+max+" состоит из "+maxl+" цифр." );}


    }

