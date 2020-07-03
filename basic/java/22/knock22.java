import java.util.Scanner;

public class knock22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        int num = Integer.parseInt(scan.next());

        if (num <= -10 || 10 <= num) {
            System.out.println("OK");
        }
    }
}
