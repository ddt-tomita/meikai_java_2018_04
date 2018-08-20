/**
 * 演習番号：演習4-24（P127）
 * 概要：正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ。
 *       素数とは、2以上n未満のいずれかの数でも割り切ることのできない整数nのことである。
 * 作成者：富田 涼子
 * 作成日：2018/08/20
 * 修正日：2018/08/20
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
        // 入力された値を制限するための変数
        final int VALUE_ZERO = 0;

        // 以下、繰り返し処理
        do {
            // プログラムの説明を行います。
            System.out.println("素数であるかを判定します。");
            // 正の整数値の入力を促す
            System.out.print("正の整数値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        // 画面から入力された値が０以上であれば終了
        } while (inputValue <= VALUE_ZERO);




        //
        final int VALUE = 2;
        // 初期値
        int sosuFlg = 0;
        // flgが１だと素数
        final int sosuFlgConst = 1;
        // 前回の値
        int zenkaiNoValue = 0;
//        条件
//        2以上である、かつ入力値を割りまくって(2～入力値)余りが0になる回数を数える
//        余りが0になった回数が1なら素数、そうでなければ素数じゃない。
//        →breakを使うからそうじゃないや…

        // 1は素数じゃない
        if(inputValue < VALUE) {
            System.out.println( inputValue + "は素数ではありません。");
        // 1以上はこちら
        }else {
            // 2から入力値までの値をループする
            for (int i = 2; i < inputValue; i++) {
                //
                int i2 = inputValue % i;

                //
                if (zenkaiNoValue == i2) {
                    sosuFlg = 1;
                    break;
                } else {
                    zenkaiNoValue = i2;
                }
            }
            if (sosuFlg == sosuFlgConst) {
                System.out.println( inputValue + "は素数です。");
            } else {
                System.out.println( inputValue + "は素数ではありません。");
            }
        }
    }
}
