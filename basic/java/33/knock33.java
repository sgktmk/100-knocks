// 整数値を入力させ、1から9まで、入力値以外を表示するプログラムを作成せよ。
import java.util.Scanner;

public class knock33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        for (int i = 0; i <= 9; i++) {
            if (i != number) {System.out.println(i);}
        }
    }
}