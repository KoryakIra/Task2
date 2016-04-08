package Task2;

import java.util.Scanner;

/**
 * Created by koryak on 30.03.2016.
 */
public class Task2_2_Decr { public static void main(String []args){
    int n;
    Scanner scan= new Scanner(System.in);
    System.out.println("Введите количество чисел в массиве");
    n=scan.nextInt();
    if (n<2) {
        System.out.println("Программа завершена");
        System.exit(0);
    }
    int []nums=new int[n];
    for (int i=0;i<n;i++){
        System.out.println("Введите "+(i+1)+"-ый элемент массива");
        nums[i]=scan.nextInt();}
//теперь сортировка по убыванию
    for(int i = 0; i < n; i++) {
        for(int j=i+1;j<n;j++){
            if(nums[i]<nums[j]){
                int tmp=nums[j];
                nums[j]=nums[i];
                nums[i]=tmp;}
        }System.out.print(nums[i]+" ");}
}


}

