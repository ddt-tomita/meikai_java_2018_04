/**
 * 演習番号：演習4-8（P113）
 * 概要：正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/18
 * 修正日：2018/06/18
 */
package e4_8;
import java.util.Scanner;

// 正の整数値を読み込んで、その桁数を出力するクラス
public class E4_8 {
    // 正の整数値を読み込んで、その桁数を出力する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 正の整数値の入力を促す文字列を画面に表示する
        System.out.print("整数値：");
        // 画面から入力された値をinputValueに格納する
        int inputValue = standardInput.nextInt();
        // 桁数を数えるための変数
        int countValue = 0;
        // inputValueの桁数を数えきった時の値
        final int inputValueEnd = 0;
        // inputValueの桁数を削っていく値
        final int inputValueDivision = 10;

        // inputValueの桁数を数えきるまでループする
        while (inputValue > inputValueEnd) {
            // inputValueの桁数を１桁削る
            inputValue /= inputValueDivision;
            // ループしながら桁数を数える
            countValue++;
        }
        // 入力された桁数を画面に表示する
        System.out.println("その桁数は" + countValue + "です。");
    }
}

