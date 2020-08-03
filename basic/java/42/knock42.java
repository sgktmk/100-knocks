// 整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成せよ。
import java.util.Scanner;

public class knock42 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);    
        System.out.print("input number 1 : ");
        int number1= Integer.parseInt(scan.next());

        System.out.print("input number 2 : ");
        int number2= Integer.parseInt(scan.next());

        System.out.print("input number 3 : ");
        int number3= Integer.parseInt(scan.next());

        if (number2 < number1) {
            System.out.println("NG"); 
        }
        else if (number3 < number2) {
            System.out.println("NG");
        } else {
            System.out.println("OK");
        }
    }
}
