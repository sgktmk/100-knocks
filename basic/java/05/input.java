import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("input 1st number: ");
        int num1 = Integer.parseInt(scan.next());

        System.out.print("input 2nd number: ");
        int num2 = Integer.parseInt(scan.next());

        System.out.println("和： " + (num1 + num2));
        System.out.println("差： " + (num1 - num2));
        System.out.println("積： " + (num1 * num2));
        System.out.println("商： " + (num1 / num2) + ", 余り：" + (num1 % num2));

    }
}