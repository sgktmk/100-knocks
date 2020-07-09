// 整数値を入力させ、その値が1ならone、2ならtwo、3ならthree、それ以外ならothersと表示するプログラムをswicth-case文を使って作成せよ。
import java.util.Scanner;

public class knock26 {
    public static void main(String args[])  {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");

        int num = Integer.parseInt(scan.next());

        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("others");
                break;
        }
    }
}
