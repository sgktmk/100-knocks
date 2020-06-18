// 整数値を入力させ、値が正であればpositive、負であればnegative、0であればzeroと表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        Double value = Double.parseDouble(scan.next());
        if (0 < value) {
            System.out.println("positive");
        } else if (value < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}