// 整数値を入力させ、その値が-10以上0未満、または、10以上であればOK、そうでなければNGと表示するプログラムを作成せよ。
import java.util.Scanner;

public class knock24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        if (-10 <= number && number < 0 || 10 <= number) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}