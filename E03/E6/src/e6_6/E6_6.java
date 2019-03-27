/**
 * 演習番号：演習6-6（P191）
 * 概要：テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ。
 *       人数と点数は、キーボードから読み込むこと。
 * 作成者：富田 涼子
 * 作成日：2019/03/27
 * 作成日：2019/03/27
 */
package e6_6;
import java.util.Scanner;

// テストの点数の合計点・平均点・最高点・最低点を表示するクラス
public class E6_6 {
    // テストの点数の合計点・平均点・最高点・最低点を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);
        // 人数用の変数
        int numberOfPeole = 0;

        // 以下、繰り返し行う処理
        do {
	        // 人数の入力を促す文字列を画面に表示する
	        System.out.print("テストを実施した人数：");
	        // 画面から数値を受け取り、定数numberOfPeoleに値を格納する
	        numberOfPeole = standardInput.nextInt();
        // 入力された人数が1人未満の場合は再度入力を促す
        } while ( numberOfPeole < 1 );

        // 人数分の点数が格納できる配列を作成する
        int[] SCORE_ARRAY = new int[numberOfPeole];
        // 人数出力用の表示補正値
        final int DISPLAY_CORRECTION_VALUE = 1;

        // 画面から入力された人数分ループする
		for (int countInt = 0; countInt < numberOfPeole; countInt++) {
	        // 点数の入力を促す文字列を画面に表示する
			System.out.print(countInt + DISPLAY_CORRECTION_VALUE + "人目の点数：");
	        // 画面から数値を受け取り、点数配列に値を格納する
			SCORE_ARRAY[countInt] = standardInput.nextInt();
		}

		// 合計値
		double totalValue = 0;
		// 平均値
		double averageValue = 0;
		// 最高点(初期値は1人目の点数を格納)
		int maxValue = SCORE_ARRAY[0];
		// 最低点(初期値は1人目の点数を格納)
		int minValue = SCORE_ARRAY[0];

        // 画面から入力された人数分ループする
		for (int countInt = 0; countInt < numberOfPeole; countInt++) {
	        // 合計値を足しこんでいく
			totalValue += SCORE_ARRAY[countInt];
	        // 現在の最高点より大きい値だったら変数を上書きする
			if (SCORE_ARRAY[countInt] > maxValue) {
				// 最高点に値を格納する
				maxValue = SCORE_ARRAY[countInt];
			}
	        // 現在の最低点より小さい値だったら変数を上書きする
			if (SCORE_ARRAY[countInt] < minValue) {
				// 最低点に値を格納する
				minValue = SCORE_ARRAY[countInt];
			}
		}
        // 平均値を算出する
		averageValue = totalValue / SCORE_ARRAY.length;

        // 合計値を出力する
		System.out.println("合計値は" + String.format("%.0f",totalValue) + "です。");
        // 平均値を出力する
		System.out.println("平均値は" + averageValue + "です。");
        // 最高点を出力する
		System.out.println("最高点は" + maxValue + "です。");
        // 最低点を出力する
		System.out.println("最低点は" + minValue + "です。");

    }
}
