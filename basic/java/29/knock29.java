// 整数値を5回入力させ、それらの値の合計を表示するプログラムを繰り返しを使って作成せよ。
import java.util.Scanner;

public class knock29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("input number: ");
            nums[i] = Integer.parseInt(scan.next());
        }
        int returnNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            returnNumber = returnNumber + nums[i];
        }
        System.out.println("sum: " + returnNumber);
    }
}