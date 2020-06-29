// 要素数10の整数型の配列を宣言し、整数値を入力させ、すべての配列の要素を入力値として、すべての要素の値を表示するプログラムを作成せよ。
import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        int num = Integer.parseInt(scan.next());

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num;
            System.out.println(nums[i]);
        }
    }
}