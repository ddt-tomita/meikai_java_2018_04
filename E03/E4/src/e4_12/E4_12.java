/**
 * 演習番号：演習4-12（P121）
 * 概要：前問とは逆に、０から正の整数値までカウントアップするプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/27
 * 修正日：2018/06/27
 */
package e4_12;
import java.util.Scanner;

// 正の整数値を０から入力した値までカウントアップするクラス
public class E4_12 {
    // 正の整数値を０から入力した値までカウントアップする
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 利用者にカウントアップを宣言する
        System.out.println("カウントアップします。");
        // 画面から入力された値を格納するinputValueを宣言する
        int inputValue = 0;

        // 画面から入力された値が０以下であれば繰り返し処理を行う
        for (int valueZero = 0; inputValue <= valueZero;) {
            // 正の整数値の入力を促す文字列を画面に表示する
            System.out.print("正の整数値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // ０からvalueZeroをインクリメントしていき、入力した値になるまで繰り返し処理を行う
        for (int countUpValue = 0; inputValue >= countUpValue; countUpValue++) {
            // カウントアップを表示する
            System.out.println(countUpValue);
        }
    }
}
