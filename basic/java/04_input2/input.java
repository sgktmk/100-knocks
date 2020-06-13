// 整数値を入力させ、その入力値を3倍した計算結果を表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        System.out.print("input number: ");
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.next());

        System.out.println("your number is " + (num * 3));
    }
}