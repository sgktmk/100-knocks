// 整数値を入力させ、その値が一桁の自然数かそうでないか判定するプログラムを作成せよ。
import java.util.Scanner;

public class knock41 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        if (0 < number && number < 10) {
            System.out.println(number + " is a single figure.");
        } else {
            System.out.println(number + " is not a single figure.");
        }
    }
}
