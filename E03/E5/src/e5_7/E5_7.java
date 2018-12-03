/**
 * 演習番号：演習5-7（P169）
 * 概要：0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/11/12
 * 修正日：2018/11/14
 */
package e5_7;

// 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するクラス
public class E5_7 {

	// 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示する
	public static void main(String[] args) {

		// 項目名を出力する
		System.out.println("   値１          値２");
		// ヘッダの区切りを出力する
		System.out.println("-----------------------------------");

		// 1000の値を意味する定数
		final int THOUSAND_VALUE = 1000;

		// 値１に出力する変数
		double outputFirstValue = 0;
		// 値２に出力する変数
		double outputSecondValue = 0;

		// 0.001ずつ値をインクリメントしていくために1000回のループを行う
		for (int countNumber = 0; countNumber <= THOUSAND_VALUE; countNumber++) {
			// 0.001ずつoutputValue1をインクリメントする
			outputFirstValue = (double) countNumber / THOUSAND_VALUE;
			// 値１を出力する
			System.out.printf("%8.7f", outputFirstValue);

			// ２つの値の堺となる空白を出力する
			System.out.print("     ");

			// outputValue1の2乗をする
			outputSecondValue = (double) outputFirstValue * outputFirstValue;
			// 値２を出力する
			System.out.printf("%20.19f", outputSecondValue);

			// 改行を出力する
			System.out.println("");

		}
	}
}
