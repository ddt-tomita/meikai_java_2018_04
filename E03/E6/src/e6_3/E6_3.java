/**
 * 演習番号：演習6-3（P185）
 * 概要：要素型がdouble型で要素数が5の配列に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して
 * 		 表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/11/14
 * 修正日：2018/11/21
 */
package e6_3;

// 要素型がdouble型で要素数が5の配列に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示するクラス
public class E6_3 {

	// 要素型がdouble型で要素数が5の配列に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示する
	public static void main(String[] args) {

		// 要素数を表す値
		final int ELEMENT_COUNT = 5;
		// 退避用変数
		double temporaryValue = 0;
		// 加算値
		final double ADDED_VALUE = 1.1;
		// 今回出力対象となる要素型がdouble型の配列
		double[] outputValue = new double[ELEMENT_COUNT];

		// 要素数分繰り返し処理を行う
		for (int countNumber = 0; countNumber < outputValue.length; countNumber++) {
			// 今回出力対象となる要素型がdouble型の配列に値を入れていく
			outputValue[countNumber] = temporaryValue += ADDED_VALUE;
		}

		// 要素数分繰り返し処理を行う
		for (int countNumber = 0; countNumber < outputValue.length; countNumber++) {
			// 配列の値を表示する
			System.out.print("doubleValue[" + countNumber + "] = ");
			System.out.printf("%2.1f",outputValue[countNumber]);
			System.out.println("");
		}
	}
}
