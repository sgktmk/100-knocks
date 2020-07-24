// {3, 7, 0, 8, 4, 1, 9, 6, 5, 2}で初期化される大きさ10の整数型配列を宣言し、整数値を入力させ、要素番号が入力値である配列要素の値を表示するプログラムを作成せよ。入力値が配列の要素の範囲外であるかどうかのチェックは省略してよい。
import java.util.Scanner;

public class knock35 {
    public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
        System.out.print("input index: ");

	int index = Integer.parseInt(scan.next());
	int array[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};

	System.out.println("array[" + index + "] = " + array[index]);
    }
}
