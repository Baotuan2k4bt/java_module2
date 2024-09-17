package ss_15.thuc_hanh;
import java.util.Scanner;
public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x: ");
        int x= scanner.nextInt();
        System.out.println("Enter y:");
        int y= scanner.nextInt();
        CalculationExample calc=new CalculationExample();
       calc.calculate(x,y);
    }
    public void calculate(int x, int y){
        try {
            int a=x+y;
            System.out.println(" result :" +a);
            int b=x-y;
            System.out.println("result"+b);
            int c=x*y;
            System.out.println("result:"+c);
            int d=x/y;
            System.out.println("result:"+d);
        } catch (Exception e) {
            System.out.println("xay ra ngoai le "+e.getMessage());
        }
    }
}
