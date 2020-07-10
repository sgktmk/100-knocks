// 整数値を入力させ、1からその値までの総和を計算して表示するプログラムを作成せよ。ただし、0以下の値を入力した場合は0と表示する。
import java.util.Scanner;

public class knock27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        System.out.println("sum: " + sumAll(number));
    }
    public static int sumAll(int inputNumber) {
        if (inputNumber == 0) {
            return 0;
        }

        int count = 1;
        int returnNumber = 0;
        while (count <= inputNumber) {
            returnNumber = returnNumber + count;
            count++;
        }
        return returnNumber;
    }
}