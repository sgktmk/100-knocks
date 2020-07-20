// 1から20まで順に表示するが、5の倍数の場合は数字の代わりにbarと表示するプログラムを作成せよ。
public class knock32 {
    public static void main(String args[]) {
        int i = 0;
        for ( i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(i);
            }
        }
    }
}
