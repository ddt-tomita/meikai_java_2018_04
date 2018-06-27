/**
 * 演習番号：演習4-10（P121）
 * 概要：読み込んだ値が１未満であれば改行文字を出力しないようにList4-11を書き換えたプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/25
 * 修正日：2018/06/27
 */
package e4_10;
import java.util.Scanner;

// 読み込んだ個数だけ*を表示するクラス
public class E4_10 {
    // 読み込んだ個数だけ*を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 何個*を表示するかをユーザーに入力してもらう
        System.out.print("何個*を表示しますか：");
        // 画面から入力された値をinputValueに格納する
        int inputValue = standardInput.nextInt();

        // countIntの値がinputValueの値より小さいの間、繰り返し処理を行う。
        for (int countInt = 0; countInt < inputValue; countInt++) {
            // 画面に*を表示する
            System.out.print('*');
        }
        // 読み込んだ値が１以上の場合
        if (inputValue > 0) {
            // 画面へ改行文字の出力を行う
            System.out.println("");
        }
    }
}
