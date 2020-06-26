// 整数値を入力させ、入力値が0でなければ再度入力させ、0であれば終了するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Integer value = isZero();
    }
    public static int isZero() {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");

        if (Integer.parseInt(scan.next()) == 0) {
            return 0;
        } else {
            return isZero();
        }
    }
}