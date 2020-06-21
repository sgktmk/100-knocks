import java.util.Scanner;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        Integer number = Integer.parseInt(scan.next());

        for(int i = 0; i < number; i++) {
            System.out.println("Hello World!");
        }
    }
}