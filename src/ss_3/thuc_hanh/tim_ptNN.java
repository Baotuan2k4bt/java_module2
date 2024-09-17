package ss_3.thuc_hanh;
import java.util.Scanner;
public class tim_ptNN {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử :");
        int n=scanner.nextInt();
        int[] array=new int[n];

        System.out.println("NHập các phần tử thứ i:");
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        int index = minvalue(array);
        System.out.println(" giá trị nhỏ nhất là: "+array[index]);
    }

    public static int minvalue(int[] array){
            int index=0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] <array[index]) {
                    index=i;

                }

            }
            return index;

        }

    }

