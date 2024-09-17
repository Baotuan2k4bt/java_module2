package ss_3.bai_tap;
import java.util.Scanner;
public class gop_mang {
        public static void main( String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers1={1,2,3,4};
            int[] numbers2={5,6,7};
            int[] numbers3 = new int[numbers1.length + numbers2.length];
            int m=0;
            for(int i=0;i<numbers1.length; i++){
                numbers3[m]=numbers1[i];
                m++;
            }
            for(int j=0;j<numbers2.length;j++){
                numbers3[m]=numbers2[j];
                m++;
            }
            for(int value:numbers3){
                System.out.println(value);
            }
        }
    

}
