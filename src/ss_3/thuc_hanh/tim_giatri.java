package ss_3.thuc_hanh;
import java.util.Scanner;
public class tim_giatri {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] students={ "Bảo Tuấn", "Duy", "Đức " ," Kiệt"};
        System.out.println("nhập tên học sinh:");
        String input_name=scanner.nextLine();
        boolean isExist=false;
        for(int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí học sinh:"+input_name+"là:"+i);
                isExist=true;
                break;
            }
        }
        if(!isExist){
            System.out.println("ko tìm thấy" +input_name+"trong danh sách");
        }
    }
}
