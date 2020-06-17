// 整数値を入力させ、値が正であればpositiveと表示するプログラムを作成せよ。ただし0は正には含まない。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        Double value = Double.parseDouble(scan.next());
        if (0 < value) {
            System.out.println("positive");
        }
    }
}