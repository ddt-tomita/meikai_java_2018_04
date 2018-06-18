/**
 * 演習番号：演習4-6（P109）
 * 概要：読み込んだ値が1未満であれば改行文字を出力しないようにList4-8を書き換えたプログラムをそれぞれ作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/18
 * 修正日：2018/06/18
 */
package e4_6;
import java.util.Scanner;

// 読み込んだ個数だけ*を表示するクラス
public class E4_6_2 {
    // 読み込んだ個数だけ*を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 何個*を表示するかをユーザーに入力してもらう
        System.out.print("何個*を表示しますか：");
        // 画面から入力された値をinputValueに格納する
        int inputValue = standardInput.nextInt();

        // 画面に出力した*の数を数えるための変数
        int countValue = 1;
        // countDownValueの値がinputValueの値より小さいの間、繰り返し処理を行う。
        while (countValue <= inputValue) {
            // 画面に*を表示する
            System.out.print('*');
            // 画面出力処理実行後、countValueの値をインクリメントする
            countValue++;
            // inputValueの値をcountValueの値が超えた時に(ループを抜ける前に)、改行文字を出力する
            if (countValue > inputValue) {
                // 画面へ改行文字の出力を行う
                System.out.println();
            }
        }
    }
}
