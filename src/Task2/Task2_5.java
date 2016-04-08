package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 06.04.2016.
 */
public class Task2_5 {
    public static void main(String[]args){
        int odd,even,n=0, k=0;
        System.out.println("Введите целые числа через пробел");
        Scanner scan=new Scanner(System.in);
        String[]nums=scan.nextLine().split(" ");
        for (String num:nums) {
            byte[]a=num.getBytes();
            odd=0;even=0;
            for (int i=0;i<a.length;i++){
                if (a[i]%2==0)
                    even=even+1;
                else odd=odd+1;
            }
            if (even>0)
                k=k+1;
            if (even==odd)
                n=n+1;
}
        System.out.println("Количество чисел, содержащих четные  цифры "+ k);
        System.out.print("Количество чисел, содержащих равное колличество четных и нечетных чисел "+ n);
    }
}
