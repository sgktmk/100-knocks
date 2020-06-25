// 整数値を入力させ、0から入力値を超えない値まで2ずつ増やして表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Integer value = hoge();
    }
    public static int hoge() {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        int hoge = Integer.parseInt(scan.next());
        if (hoge == 0) {
            return 0;
        } else {
            hoge();
        }
    }
}