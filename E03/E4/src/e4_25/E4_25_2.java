/**
 * 演習番号：演習4-25（P129）
 * 概要：合計だけでなく平均も求めるようにList4-18のプログラムを書き換えよ。
 * 作成者：富田 涼子
 * 作成日：2018/09/10
 * 修正日：2018/09/10
 */
package e4_25;

import java.util.Scanner;

// 正の整数値を読み込み、それが素数であるかどうかを判定するクラス
public class E4_25_2 {
    // 正の整数値を読み込み、それが素数であるかどうかを判定する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        int inputValue = 0;
        // ゼロという数値を表す定数
        final int VALUE_ZERO = 0;

        // 以下、繰り返し処理
        do {
            // プログラムの説明を行う
            System.out.println("素数であるかを判定します。");
            // 正の整数値の入力を促す
            System.out.print("正の整数値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        // 画面から入力された値が０以上であれば終了
        } while (inputValue <= VALUE_ZERO);


        // 素数計算のために割り算を行う開始値
        final int START_VALUE = 2;
        // 割り算した余りを退避する変数
        int remainderValue = 0;
        // 素数かどうか判定するためのカウンタ
        int primeNumbersCounter = 0;

        // 入力値が2以上の場合
        if(inputValue >= START_VALUE) {
            // 2以上入力値以下の値をインクリメントしながらループする
            for(int countValue = START_VALUE; countValue <= inputValue; countValue++) {
                // 素数判定のために現在ループしている値で入力値が割り切れるかを確認する
                remainderValue = inputValue % countValue;
                // 入力値÷countValueで割り切れた場合
                if(remainderValue == VALUE_ZERO) {
                    // 割り切れた回数をカウントしていく
                    primeNumbersCounter++;
                    // 2回以上割り切れた場合
                    if(primeNumbersCounter > START_VALUE) {
                        // 素数でないことが確定したので、処理を抜ける
                        break;
                    }
                }
            }

            // 2以上入力値以下で割り算をした際、入力値でしか割り切れなかった場合
            if(primeNumbersCounter == 1) {
                // 素数であることを画面に表示する
                System.out.println( inputValue + "は素数です。");
            // 2以上入力値以下で割り算をした際、入力値以外でも割り切れた場合
            } else {
                // 素数ではないことを画面に表示する
                System.out.println( inputValue + "は素数ではありません。");
            }

        // 入力値が2未満の場合
        } else {
            // 入力値が1だった場合、入力値は素数ではない
            System.out.println( inputValue + "は素数ではありません。");
        }
    }
}
