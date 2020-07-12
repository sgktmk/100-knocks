// 整数値を入力させ、その値の階乗を表示するプログラムを作成せよ。ただし、0以下の値を入力した場合は1と表示する。
import java.util.Scanner;

public class knock28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        System.out.println("factorial: " + factorial(number));
    }
    public static int factorial(int inputNumber) {
        if (inputNumber <= 0) {
            return 1;
        }

        int count = 1;
        int returnNumber = 1;
        while (count <= inputNumber) {
            returnNumber = returnNumber * count;
            count++;
        }
        return returnNumber;
    }
}