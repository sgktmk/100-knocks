// 整数値を入力させ、1から9まで、入力値と入力値+1以外を表示するプログラムを作成せよ。入力値が9の場合は9のみ表示しない。
import java.util.Scanner;

public class knock34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        int max = 9;
        for (int i = 0; i <= max; i++) {
            if (number == max && i == max) {
                continue;
            }
            if (i == number + 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}