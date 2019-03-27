/**
 * 演習番号：演習6-4（P187）
 * 概要：List6-5を書き換えて、右に示すように縦向きの棒グラフで表示するプログラムを作成せよ。
 * 		 最下段には、インデックスを10で割った剰余を表示すること。
 * 作成者：富田 涼子
 * 作成日：2018/11/21
 * 修正日：2019/03/06
 */
package e6_4;

import java.util.Random;
import java.util.Scanner;

// List6-5を書き換えて、右に示すように縦向きの棒グラフで表示するクラス
public class E6_4 {

	// List6-5を書き換えて、右に示すように縦向きの棒グラフで表示する
	public static void main(String[] args) {

		// ランダムクラスのインスタンス生成
		Random random = new Random();
		// 標準入力ストリームのインスタンス化をする
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す文字列を画面に表示する
		System.out.print("要素数：");
		// 要素数の入力を画面から受け取り、定数ELEMENT_COUNTに入力値を格納する
		final int ELEMENT_COUNT = standardInput.nextInt();
		// 棒グラフ配列の要素数を決定する。
		int[] outputBarGraph = new int[ELEMENT_COUNT];

		// 棒グラフの最小値
		final int MIN_NUM_FOR_BAR_GRAPH = 1;
		// インデックス用の割る値
		final int DIVIDE_VALUE = 10;
		// 棒グラフ用の乱数
		final int RANDOM_NUM_FOR_BAR_GRAPH = 10;
		// 初段
		final int FIRST_STAGE = 1;
		// 最上段
		final int MAX_STAGE = 10;

		// 配列の要素数だけループする
		for (int i = 0; i < ELEMENT_COUNT; i++) {
			// 一旦、棒グラフに出力する*印の個数を配列に入れ込む
			outputBarGraph[i] = MIN_NUM_FOR_BAR_GRAPH + random.nextInt(RANDOM_NUM_FOR_BAR_GRAPH);
		}

		// 段数分のループ(10段～1段目まで下っていく)
		for (int numberOfStages = MAX_STAGE; numberOfStages >= FIRST_STAGE; numberOfStages--) {

			// 現在の段数
			StringBuffer currentStage = new StringBuffer("");

			// 配列の要素数だけループする（横幅分のループ）
			for (int i = 0; i < ELEMENT_COUNT; i++) {

				// 棒グラフ配列の値が現在の段数以上だった場合
				if (numberOfStages <= outputBarGraph[i]) {
					// 現在の段数にアスタリスクを結合する。
					currentStage.append("* ");
				// 棒グラフ配列の値が現在の段数未満だった場合
				} else {
					// 現在の段数に空白を結合する。
					currentStage.append("  ");
				}
			}
			// 現在の段数の内容を出力する
			System.out.println(currentStage);
		}

		// フッター１行目の変数(仕切り線)
		StringBuffer firstLine = new StringBuffer("");
		// フッター１行目に結合していく文字列
		final String JOIN_STRING = "--";
		// フッター２行目の変数(インデックスを10で割った余剰)
		StringBuffer secondLine = new StringBuffer("");

		// フッター用のループ文
		for (int i = 0; i < ELEMENT_COUNT; i++) {
			// 要素数の幅に合わせて仕切り線を結合していく
			firstLine.append(JOIN_STRING);
			// 最下段にインデックスを振っていく
			secondLine.append(i % DIVIDE_VALUE + " ");
		}
		// 仕切り線の出力
		System.out.println(firstLine);
		// インデックスの出力
		System.out.println(secondLine);
	}
}
