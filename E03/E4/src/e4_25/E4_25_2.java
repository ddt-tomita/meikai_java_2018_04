/**
 * 演習番号：演習4-25（P129）
 * 概要：合計だけでなく平均も求めるようにList4-18のプログラムを書き換えよ。
 * 作成者：富田 涼子
 * 作成日：2018/09/10
 * 修正日：2018/09/17
 */
package e4_25;

import java.util.Scanner;

// 読み込んだ整数を加算いき、合計も出力するクラス（合計が1,000を超えない範囲で加算する）
public class E4_25_2 {
    // 読み込んだ整数を加算していき、合計も出力する（合計が1,000を超えない範囲で加算する）
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
        // 画面から入力された値が０以下であれば終了
        } while (inputValue <= VALUE_ZERO);

        // 合計値を格納する変数
        double sumValue = 0;
        // 平均値を格納する変数
        double aveValue = 0;
        // 合計の制限値
        final int LIMIT_VALUE = 1000;

        // 入力した値の数だけループする
        for (int countValue = 1; countValue <= inputValue; countValue++) {
            // 加算する値の入力を促す
            System.out.print("整数：");
            // 画面から入力された値をtmpValueに退避する
            int tmpValue = standardInput.nextInt();
            // 今までの合計値と今回の入力値を足して1,000を超える場合はループを終了する
            if (sumValue + tmpValue > LIMIT_VALUE) {
                // 合計が1,000を超えたのでメッセージを表示する
                System.out.println("合計が1,000を超えました。");
                // 合計が1,000を超えたのでメッセージを表示する
                System.out.println("最後の数値は無視します。");
                // このfor文から抜ける
                break;
            }
            // 入力された値をsumValueに足しこんでいく
            sumValue += tmpValue;
            // 合計値を入力回数で割って平均値を求める
            aveValue = sumValue / countValue;
        }

        // 入力された値の合計を出力する
        System.out.println("合計は" + sumValue + "です。");
        // 入力された値の平均を出力する
        System.out.println("平均は" + aveValue + "です。");
    }
}
