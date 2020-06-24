// 整数値を入力させ、0から入力値を超えない値まで2ずつ増やして表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        Integer value = Integer.parseInt(scan.next());
        Integer num = 0;
        while (num <= value) {
            System.out.println(num);
            num = num + 2;
        }
    }
}