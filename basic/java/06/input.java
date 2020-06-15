// 整数値を入力させ、値が0ならzeroと表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        String value = scan.next();
        if (value.equals("0")) {
            System.out.println("zero");
        }

    }
}