// 整数値を入力させ、入力値から0まで数を1ずつ減らして表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        Integer value = Integer.parseInt(scan.next());
        while (0 <= value) {
            System.out.println(value);
            value--;
        }
    }
}