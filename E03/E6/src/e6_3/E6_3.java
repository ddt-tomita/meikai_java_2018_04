/**
 * 演習番号：演習6-3（P185）
 * 概要：要素型がdouble型で要素数が5の配列に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して
 * 		 表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/11/14
 * 修正日：2018/11/14
 */
package e6_3;

// 要素型がdouble型で要素数が5の配列に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示するクラス
public class E6_3 {

	// 要素型がdouble型で要素数が5の配列に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示する
	public static void main(String[] args) {

		// 要素数を表す値
		final int ELEMENT_COUNT = 5;
		// 要素数を表す値
		final double ELEMENT_COUNT2 = 10;
		// 要素数を表す値
		final double ELEMENT_COUNT3 = 1;
		// 要素型がdouble型の配列
		double[] doubleValue = new double[ELEMENT_COUNT];

		// 配列の数だけ繰り返し処理を行う
		for (int countNumber = 0; countNumber < ELEMENT_COUNT; countNumber++) {
			// 要素型がdouble型の配列に値を入れていく
			doubleValue[countNumber] = countNumber + ELEMENT_COUNT3 + (ELEMENT_COUNT3 / ELEMENT_COUNT2 + countNumber / ELEMENT_COUNT2);
		}

		// 配列の数だけ繰り返し処理を行う
		for (int countNumber = 0; countNumber < ELEMENT_COUNT; countNumber++) {
			// 要素型がdouble型の配列の値を表示していく
			System.out.println("doubleValue[" + countNumber + "] = " + doubleValue[countNumber]);
		}
	}
}
