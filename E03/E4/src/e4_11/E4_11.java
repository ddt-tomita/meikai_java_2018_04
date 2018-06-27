/**
 * 演習番号：演習4-11（P121）
 * 概要：正の整数値を０までカウントダウンするList4-4をfor文で実現せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/27
 * 修正日：2018/06/27
 */
package e4_11;
import java.util.Scanner;

// 正の整数値を０までカウントダウンするクラス
public class E4_11 {
    // 正の整数値を０までカウントダウンする
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 利用者にカウントダウンを宣言する
        System.out.println("カウントダウンします。");
        // 画面から入力された値を格納するinputValueを宣言する
        int inputValue = 0;

        // 画面から入力された値が０以下であれば繰り返し処理を行う
        for (int valueZero = 0; inputValue <= valueZero;) {
            // 正の整数値の入力を促す文字列を画面に表示する
            System.out.print("正の整数値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // 画面から入力された値をデクリメントしていき、０になるまで繰り返し処理を行う
        for (int valueZero = 0; inputValue >= valueZero; inputValue--) {
            // カウントダウンを表示する
            System.out.println(inputValue);
        }
    }
}
