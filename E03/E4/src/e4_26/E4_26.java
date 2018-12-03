/**
 * 演習番号：演習4-26（P129）
 * 概要：合計だけでなく平均も求めるようにList4-19のプログラムを書き換えよ。
 *       なお、読み込んだ負の数の個数は平均を求める分母から除外すること。
 * 作成者：富田 涼子
 * 作成日：2018/09/17
 * 修正日：2018/10/29
 */
package e4_26;

import java.util.Scanner;

// 読み込んだ整数を加算していき、合計も出力するクラス（負の値は加算しない）
public class E4_26 {
    // 読み込んだ整数を加算していき、合計も出力する（負の値は加算しない）
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
            System.out.println("整数を加算します。");
            // 値の入力を促す
            System.out.print("何個加算しますか：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        // 画面から入力された値が０以下であれば繰り返し入力を促す
        } while (inputValue <= VALUE_ZERO);

        // 合計値を格納する変数
        double sumValue = 0;
        // 平均値を格納する変数
        double aveValue = 0;
        // 平均値を算出するための分母をあらわす変数
        int divisionValue = 0;

        // 入力した値の数だけループする
        for (int countValue = 1; countValue <= inputValue; countValue++) {
            // 加算する値の入力を促す
            System.out.print("整数：");
            // 画面から入力された値をtmpValueに退避する
            int tmpValue = standardInput.nextInt();
            // 負の値が入力された場合
            if (tmpValue < VALUE_ZERO) {
                // 負の値が加算の対象にならないという説明文を出力する
                System.out.println("負の数は加算しません。");
                // continue以下の処理は行わず、ループの頭に戻る。
                continue;
            }
            // 入力された値をsumValueに足しこんでいく
            sumValue += tmpValue;
            // 平均値を算出するための分母をインクリメントしていく
            divisionValue++;
        }
        // 合計値を入力回数(負の値が入力された回数は除く)で割って平均値を求める
        aveValue = sumValue / divisionValue;

        // 入力された値の合計を出力する
        System.out.println("合計は" + sumValue + "です。");
        // 入力された値の平均を出力する
        System.out.println("平均は" + aveValue + "です。");
    }
}
