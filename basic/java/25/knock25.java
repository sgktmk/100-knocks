// 整数値を入力させ、その値が-10未満ならrange 1、-10以上0未満であればrange 2、0以上であればrange 3、と表示するプログラムを作成せよ。
import java.util.Scanner;

public class knock25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");

        int number = Integer.parseInt(scan.next());

        if (0 <= number) {
            System.out.println("range 3");
        } else if (-10 <= number) {
            System.out.println("range 2");
        } else {
            System.out.println("range 1");
        }
    }
}
