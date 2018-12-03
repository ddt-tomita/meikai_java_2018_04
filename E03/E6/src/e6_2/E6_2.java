/**
 * 演習番号：演習6-2（P185）
 * 概要：要素型がint型で要素数が5の配列に対して、先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/11/14
 * 修正日：2018/11/14
 */
package e6_2;

// 要素型がint型で要素数が5の配列に対して、先頭から順に5,4,3,2,1を代入して表示するクラス
public class E6_2 {

	// 要素型がint型で要素数が5の配列に対して、先頭から順に5,4,3,2,1を代入して表示する
	public static void main(String[] args) {

		// 要素数を表す値
		final int ELEMENT_COUNT = 5;
		// 要素型がint型の配列
		int[] intValue = new int[ELEMENT_COUNT];

		// 配列の数だけ繰り返し処理を行う
		for (int countNumber = 0; countNumber < intValue.length; countNumber++) {
			// 要素型がint型の配列に値を代入していく
			intValue[countNumber] = intValue.length - countNumber;
		}

		// 配列の数だけ繰り返し処理を行う
		for (int countNumber = 0; intValue.length > countNumber; countNumber++) {
			// 要素型がint型の配列の値を表示していく
			System.out.println("intValue[" + countNumber + "] = " + intValue[countNumber]);
		}
	}
}
