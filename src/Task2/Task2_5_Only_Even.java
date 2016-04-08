package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 06.04.2016.
 */
public class Task2_5_Only_Even {
    public static void main(String[]args){
        int odd=0,even=0,n=0;
        System.out.println("Введите целые числа через пробел");
        Scanner scan=new Scanner(System.in);
        String[]nums=scan.nextLine().split(" ");
        for (String num:nums) {
            byte[]a=num.getBytes();
            even=0;
            for (int i=0;i<a.length;i++){
                if (a[i]%2!=0){
                    odd=odd+1;break;
            }
               else even=even+1;
        }
               if(even==a.length)
                   n=n+1;

}
        System.out.println("Количество чисел, содержащих только четные цифры: "+ n);
    }
}
