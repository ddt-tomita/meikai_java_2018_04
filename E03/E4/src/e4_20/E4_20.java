/**
 * 演習番号：演習4-20（P125）
 * 概要：n段の正方形を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/07/04
 * 修正日：2018/07/04
 */
package e4_20;
import java.util.Scanner;

// n段の正方形を表示するクラス
public class E4_20 {
    // n段の正方形を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        int inputValue = 0;
        // 入力された値を制限するための変数
        int valueZero = 0;

        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValue <= valueZero) {
            // 値の入力を促す
            System.out.print("nの値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // 正方形の高さを管理するループ文。入力した値の数だけ繰り返す。
        for ( int heightInt = 0; heightInt < inputValue; heightInt++) {
            // 正方形の幅を管理するループ文。入力した値の数だけ繰り返す。
            for ( int widthInt = 0; widthInt < inputValue; widthInt++) {
                // 画面に*を表示する
                System.out.print('*');
            }
            // 改行を行う
            System.out.println("");
        }
    }
}
