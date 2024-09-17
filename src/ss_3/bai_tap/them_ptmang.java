package ss_3.bai_tap;
import java.util.Scanner;
public class them_ptmang {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] number={1,2,3,4,5,6};
        int n=7;
        int[] number2= new int[number.length+1 ];
        for(int i=0;i<number.length;i++){
            number2[i]=number[i];
        }
        number2[number2.length-1]=n;
        for(int value:number2){
            System.out.println(value);
        }
    }
}
