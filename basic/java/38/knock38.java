// {3, 7, 0, 8, 4, 1, 9, 6, 5, 2}で初期化される大きさ10の整数型配列を宣言し、最初は参照する要素番号を0とし、この参照する要素番号の配列要素の値を表示し、次にその配列要素の値を次の参照する要素番号とし、この次の参照する要素番号の配列要素の値を表示し、さらにその配列要素の値を次の参照する要素番号とし、……を10回繰り返すプログラムを作成せよ。（具体的にどのような手順かは実行例を見て考えよう。）

public class knock38 {
    public static void main(String args[]) {
        int array[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};

        int nextIndex = 0;
        int number = 0;
        for (int i = 0; i < 10; i++) {
            number = array[nextIndex];
            System.out.println(number);
            nextIndex = number;
        }
    }
}
