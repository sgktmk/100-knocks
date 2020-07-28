// 整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成せよ。
import java.util.Scanner;

public class knock40 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
