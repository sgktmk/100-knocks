// 整数値を入力させ、その個数だけ*を、5個おきに空白（スペース）を入れて表示するプログラムを作成せよ。入力値が0以下の値の場合は何も書かなくてよい。
import java.util.Scanner;
import java.util.Collections;

public class knock31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        int number = Integer.parseInt(scan.next());

        System.out.println(String.join("", Collections.nCopies(number, "*")).replace("*****", "***** "));
    }
}