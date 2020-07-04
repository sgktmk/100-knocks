// 整数値を入力させ、その値が-5以上10未満であればOK、そうでなければNGと表示するプログラムを作成せよ。
import java.util.Scanner;

public class knock23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        if (-5 <= number && number < 10) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}