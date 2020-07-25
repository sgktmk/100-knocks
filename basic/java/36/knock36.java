// {3, 7, 0, 8, 4, 1, 9, 6, 5, 2}で初期化される大きさ10の整数型配列を宣言し、整数値を2つ入力させ、要素番号が入力値である2つの配列要素の値の積を計算して表示するプログラムを作成せよ。入力値が配列の要素の範囲外であるかどうかのチェックは省略してよい。
import java.util.Scanner;

public class knock36 {
    public static void main(String args[]) {
        int array[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
        Scanner scan = new Scanner(System.in); 

        System.out.print("input index1: ");
        int index1 = Integer.parseInt(scan.next());

        System.out.print("input index2: ");
        int index2 = Integer.parseInt(scan.next());

        System.out.print(array[index1] + " * " + array[index2] + " = " + (array[index1] * array[index2]));
    }
}
