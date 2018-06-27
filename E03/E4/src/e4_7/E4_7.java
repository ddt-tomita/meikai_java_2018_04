/**
 * 演習番号：演習4-7（P109）
 * 概要：読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 *       表示は * と + を交互に行うこと。
 * 作成者：富田 涼子
 * 作成日：2018/06/18
 * 修正日：2018/06/18
 */
package e4_7;
import java.util.Scanner;

// 読み込んだ値の個数だけ記号文字を表示するクラス
public class E4_7 {
    // 読み込んだ値の個数だけ記号文字を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 何個*を表示するかをユーザーに入力してもらう
        System.out.print("何個*を表示しますか：");
        // 画面から入力された値をinputValueに格納する
        int inputValue = standardInput.nextInt();

        // 画面に出力した*の数を数えるための変数
        int countValue = 0;
        // countDownValueの値がinputValueの値より小さいの間、繰り返し処理を行う。
        while (countValue < inputValue) {
            // 一番最初のループ時または偶数回目のループの際に*を出力する
            if (countValue % 2 == 0 ) {
                // 画面に*を出力する
                System.out.print('*');
            // 奇数回目のループの際に+を出力する
            } else {
                // 画面に+を出力する
                System.out.print('+');
            }
            // countValueをインクリメントし、出力した記号の数を取得する
            countValue++;
        }
    }
}
