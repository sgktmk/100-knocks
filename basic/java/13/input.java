// 整数値を入力させ、0から入力値まで数を1ずつ増やして表示するプログラムを作成せよ。
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("input number: ");
        Integer value = Integer.parseInt(scan.next());
        Integer num = 0;
        while (num <= value) {
            System.out.println(num);
            num ++;
        }
    }
}