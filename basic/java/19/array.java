// 要素数5の整数型の配列を宣言し、すべての配列に対して順に入力された整数値を代入し、すべての要素の値を表示するプログラムを作成せよ。
import java.util.*;

public class array {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.print("input number: ");
            nums[i] = Integer.parseInt(scan.next());
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}