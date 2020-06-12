// 整数値を入力させ、その入力値を表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        System.out.print("input number: ");
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println("your number is " + str);
    }
}