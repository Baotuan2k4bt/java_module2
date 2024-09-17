package ss_3.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class xoa_phantumang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        System.out.println("Nhập số lượng phần tử :");
        int n=scanner.nextInt();
        int[] array=new int[n];
        System.out.println("NHập các phần tử thứ i:");
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        //b2 NHập  x là phần tử cần xóa
        System.out.println("Nhập phần tử cần xóa:");
        int x=scanner.nextInt();
        //b3 tim X xem có xuất hiện trong mảng không
        int intdex_del=-1;// khởi tạo biến vị trí cần xóa
         for(int i=0;i<array.length;i++) {
             if (array[i] == x) {
                 intdex_del = i;
                 break;
             }
         }
         //nếu không tìm thấy phần tử
        if(intdex_del==-1){
            System.out.println("Phần tử "+x+"không tồn tại");

        }else{
            System.out.println("Phần tử "+x+"có tồn tại");
        }
        // Bước 4: Thực hiện xóa phần tử X khỏi mảng
        for (int i = intdex_del; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // gán phần tử ở vị trí index cho phần tử ở index + 1
        }
        // Bước 5: Kết thúc duyệt mảng. In ra mảng.
        // Giảm kích thước mảng do đã xóa một phần tử
        int[] newArray = Arrays.copyOf(array, array.length - 1); // tạo mảng mới với kích thước giảm

        System.out.println("Mảng sau khi xóa phần tử " + x + ": " + Arrays.toString(newArray));
    }

}