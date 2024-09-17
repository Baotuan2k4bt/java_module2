package ss_3.thuc_hanh;
import java.util.Scanner;
public class tim_ptLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println(" Nhập kích thước mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("kích thước không thể lớn hơn 20");

        } while (size > 20);

        //NHập các giá trị cho các phần tử của mảng
        array = new int[size];
        int i=0;
        while(i<array.length) {
            System.out.println("NHập phần tử mảng " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("danh sách mảng :");
            for(int j=0;j<array.length;j++){
                System.out.println(array[j] +"\t");
            }
            int max = array[0];
            int index = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.println("phần tử lớn nhất trong mảng là :"+max+",vi tri "+index);
        }
    }

