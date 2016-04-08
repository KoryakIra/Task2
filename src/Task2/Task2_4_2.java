package Task2;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by koryak on 04.04.2016.
 */
public class Task2_4_2 {


        public static void main(String args[]) {
            System.out.println("Введите целые числа через пробел");
            Scanner scan = new Scanner(System.in);
            String[] nums = scan.nextLine().split(" ");
            int arr1[] = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                arr1[i]=0;
            }
            int k=0;
            for (String num : nums) {
                byte[] a = num.getBytes();
                Arrays.sort(a);
                int tmp=1, step=1;
                for (int i = 0; i < a.length; i+=step) {
                    step=1;
                    for(int j=i; j<(a.length-1);j++){
                        if(a[j]!=a[j+1]){
                            tmp++; break;
                        }
                        step++;
                    }
                }
                arr1[k++]=tmp;
            }
            int min = 0;
            for(k=1;k<nums.length;k++){
                if(arr1[k] < arr1[min]){
                    min = k;
                }
            }
            System.out.println("Искомое число " + nums[min]);
            for(k=0;k<nums.length;k++){System.out.print(arr1[k]+" ");}
        }
    }

