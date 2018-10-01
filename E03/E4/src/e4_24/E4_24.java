/**
 * 演習番号：演習4-24（P127）
 * 概要：正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ。
 *       素数とは、2以上n未満のいずれかの数でも割り切ることのできない整数nのことである。
 * 作成者：富田 涼子
 * 作成日：2018/08/20
 * 修正日：2018/09/12
 */
package e4_24;

import java.util.Scanner;

// 正の整数値を読み込み、それが素数であるかどうかを判定するクラス
public class E4_24 {
    // 正の整数値を読み込み、それが素数であるかどうかを判定する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        int inputValue = 0;
        // 素数計算のための制限値
        final int LIMITING_VALUE = 2;

        // 以下、繰り返し処理
        do {
            // プログラムの説明を行う
            System.out.println("素数であるかを判定します。");
            // 正の整数値の入力を促す
            System.out.print("正の整数値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        // 画面から入力された値が２以上であれば終了
        } while (inputValue < LIMITING_VALUE);


        // 割り算した余りを退避する変数
        int remainderValue = 0;
        // 割り切れた時の余りを判定するための変数
        final int DIVISIBLE_VALUE = 0;
        // 入力値を半分にしたときの値(小数は切り捨てる)
        final int HALF_VALUE = inputValue / 2;

        // 2以上入力値以下の値をインクリメントしながらループする
        for(int countValue = LIMITING_VALUE; countValue <= inputValue; countValue++) {
            // 素数判定のために現在ループしている値で入力値が割り切れるかを確認する
            remainderValue = inputValue % countValue;

            // 入力値以外で割り切れた場合は素数ではない
            if( remainderValue == DIVISIBLE_VALUE && countValue != inputValue) {
                // 素数ではないことを画面に表示する
                System.out.println( inputValue + "は素数ではありません。");
                // 素数でないことが確定したので、処理を抜ける
                break;

                // 入力値÷２以上の値まで計算しても割り切れなかった場合は素数である
                } else if (countValue > HALF_VALUE){
                    // 素数であることを画面に表示する
                    System.out.println( inputValue + "は素数です。");
                    break;

            }
        }
    }
}
