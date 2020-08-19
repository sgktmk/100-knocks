// 2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成せよ。

import java.util.Scanner;

public class knock43 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input a: ");
        int num1 = Integer.parseInt(scan.next());
        System.out.print("input b: ");
        int num2 = Integer.parseInt(scan.next());
        System.out.print("input c: ");
        int num3 = Integer.parseInt(scan.next());

        System.out.println(num1 + num2 + num3);
        System.out.println(num1 + num2 + num3);
    }
}
