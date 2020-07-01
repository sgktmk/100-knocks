// 整数値を2つ入力させ、1つめの値を2つめの値で割った結果を表示し、続けてその結果に2つめの値を掛けた結果を表示するプログラムを作成せよ。
// 計算はすべて整数型で行うこと（割り切れない場合は自動的に小数点以下が切り捨てられる）。
import java.util.Scanner;

public class knock20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input 1st value: ");
        int num1 = Integer.parseInt(scan.next());
        System.out.print("input 2nd value: ");
        int num2 = Integer.parseInt(scan.next());

        int result = num1 / num2;
        System.out.println("result: " + (result));
        System.out.println("result: " + (result * num2));
    }
}