// 整数値を入力させ、その値が5よりも大きく、かつ、20よりも小さければOKと表示するプログラムを作成せよ。
import java.util.Scanner;

public class knock21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        int num = Integer.parseInt(scan.next());

        if (5 < num && num < 20) {
            System.out.println("OK");
        }
    }
}