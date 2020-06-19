// 整数値を入力させ、その値を絶対値にして表示するプログラムを作成せよ。（できれば変数の値を絶対値に変えるようにせよ）
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        Integer value = Integer.parseInt(scan.next());
        System.out.println("absolute value is " + Math.abs(value));
    }
}