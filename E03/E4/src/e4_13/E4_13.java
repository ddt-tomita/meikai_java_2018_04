/**
 * 演習番号：演習4-13（P121）
 * 概要：１からｎまでの和を求めるList4-10をfor文で実現せよ
 * 作成者：富田 涼子
 * 作成日：2018/07/02
 * 修正日：2018/07/02
 */
package e4_13;
import java.util.Scanner;

// １からｎまでの和を求めるクラス
public class E4_13 {
    // １からｎまでの和を求める
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // このプログラムの機能を画面に表示する
        System.out.println("1からnまでの和を求めます。");

        // 画面から入力された値を格納するinputValueを宣言する
        int inputValue = 0;
        // 入力された値を制限するための変数
        int valueZero = 0;

        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValue <= valueZero) {
            // 値の入力を促す文字列を画面に表示する
            System.out.print("nの値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // １からｎまでの和を足しこんでいくための変数
        int outputValue = 0;

        // inputValueに入力された回数ループする
        for (int countValue = 0; inputValue >= countValue; countValue++) {
            // outputValueに値を足しこんでいく
            outputValue += countValue;
        }

        // 足しこんでいった和を画面に表示する
        System.out.println("1から" + inputValue + "までの和は" + outputValue + "です。");
    }
}

