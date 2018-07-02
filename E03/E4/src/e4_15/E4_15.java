/**
 * 演習番号：演習4-15（P121）
 * 概要：身長と標準体重の対応表を表示するプログラムを作成せよ。
 *       表示する身長の範囲（開始値／終了値／増分）は、整数値として読み込むこと。
 *       ※標準体重は（身長－100）×0.9によって求められる。
 * 作成者：富田 涼子
 * 作成日：2018/07/02
 * 修正日：2018/07/02
 */
package e4_15;
import java.util.Scanner;

// 身長と標準体重の対応表を表示するクラス
public class E4_15 {
    // 身長と標準体重の対応表を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 「何cmから」の値を格納する変数
        int inputValueFrom = 0;
        // 「何cmまで」の値を格納する変数
        int inputValueTo = 0;
        // 「何cmごと」の値を格納する変数
        int inputValueIncremental = 0;
        // 入力された値を制限するための変数
        int valueZero = 0;

        /* 開始値 */
        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValueFrom <= valueZero) {
            // 値の入力を促す文字列を画面に表示する
            System.out.print("何cmから：");
            // 画面から入力された値をinputValueに格納する
            inputValueFrom = standardInput.nextInt();
        }

        /* 終了値 */
        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValueTo <= valueZero) {
            // 値の入力を促す文字列を画面に表示する
            System.out.print("何cmまで：");
            // 画面から入力された値をinputValueに格納する
            inputValueTo = standardInput.nextInt();
        }

        /* 増分 */
        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValueIncremental <= valueZero) {
            // 値の入力を促す文字列を画面に表示する
            System.out.print("何cmごと：");
            // 画面から入力された値をinputValueに格納する
            inputValueIncremental = standardInput.nextInt();
        }

        // 項目名を画面に表示する
        System.out.println("身長  標準体重");
        // 標準体重を表す変数
        double weightValue = 0;
        // 標準体重を求める際、マイナスする値を格納する変数
        final int weightMinusValue = 100;
        // 標準体重を求める際、掛け算する値を格納する変数
        final double weightMultiplyValue = 0.9;

        // 開始値から終了値まで繰り返し処理を行う
        while (inputValueFrom <= inputValueTo) {
            // 標準体重を求めていく （身長－100）× 0.9
            weightValue = (inputValueFrom - weightMinusValue) * weightMultiplyValue;
            // 身長体重を画面に表示していく
            System.out.println(inputValueFrom + "   " + weightValue);
            // 開始値に増分を足しこんでいく
            inputValueFrom += inputValueIncremental;
        }

    }
}

