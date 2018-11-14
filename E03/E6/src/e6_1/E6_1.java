/**
 * 演習番号：演習6-1（P183）
 * 概要：要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/11/14
 * 修正日：2018/11/14
 */
package e6_1;

// 要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するクラス
public class E6_1 {

	// 要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示する
	public static void main(String[] args) {

		// 要素数を表す値
		final int ELEMENT_COUNT = 5;
		// 要素型がdouble型の配列
		double[] doubleValue = new double[ELEMENT_COUNT];

		// 配列の数だけ繰り返し処理を行う
		for (int countNumber = 0; countNumber < ELEMENT_COUNT; countNumber++) {
			// 要素型がdouble型の配列に値を入れていく
			doubleValue[countNumber] = countNumber;
		}

		// 配列の数だけ繰り返し処理を行う
		for (int countNumber = 0; countNumber < ELEMENT_COUNT; countNumber++) {
			// 要素型がdouble型の配列の値を表示していく
			System.out.println("doubleValue[" + countNumber + "] = " + doubleValue[countNumber]);
		}
	}
}
