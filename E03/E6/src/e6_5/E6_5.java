/**
 * 演習番号：演習6-5（P189）
 * 概要：配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するプログラムを作成せよ。
 * 		 表示の形式は、初期化子と同じ形式、すなわち、各要素の値をコンマで区切って{}で囲んだ形式とすること。
 * 作成者：富田 涼子
 * 作成日：2018/12/03
 * 修正日：2018/12/03
 */
package e6_5;

import java.util.Scanner;

// 配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するクラス
public class E6_5 {

	// 配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示する
	public static void main(String[] args) {

		// 標準入力ストリームのインスタンス化をする
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す文字列を画面に表示する
		System.out.print("要素数：");
		// 要素数の入力を画面から受け取り、定数ELEMENT_COUNTに入力値を格納する
		final int ELEMENT_COUNT = standardInput.nextInt();
		// 画面に表示する配列の要素数を決定する。
		int[] inputValue = new int[ELEMENT_COUNT];

		for (int countValue = 0; countValue < ELEMENT_COUNT; countValue++) {
			// 要素数の入力を促す文字列を画面に表示する
			System.out.print("outputValue["+countValue+"] = ");
			//
			inputValue[countValue] = standardInput.nextInt();
		}

		//
		int[] outputValue = {};
	}
}
