/**
 * 演習番号：演習5-6（P169）
 * 概要：List5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 * 		 List5-10のように、int型の変数を0から1000までインクリメントした値を1000で割った値を
 * 		 求める様子を、横に並べて表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/11/03
 * 修正日：2018/11/12
 */
package e5_6;

// float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、int型の変数を0から1000までインクリメントした値を
// 1000で割った値を求める様子を、横に並べて表示するクラス
public class E5_6 {

	// float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、int型の変数を0から1000までインクリメントした値を
	// 1000で割った値を求める様子を、横に並べて表示する
    public static void main(String[] args) {

    	// 項目名を出力する
        System.out.println("   float         int");
    	// ヘッダの区切りを出力する
        System.out.println("------------------------------");

    	// 1000の値を意味する定数
        final int THOUSAND_VALUE = 1000;
    	// float型に足しこんでいく定数
        final float FLOAT_INCREMENT = 0.001F;

        // float項目に出力する変数
    	float floatNumber = 0.0F;
        // int項目に出力する変数
    	float intNumber = 0.0F;

    	// float項目とint項目をインクリメントしていくために1000回のループを行う
    	for (int countNumber = 0; countNumber <= THOUSAND_VALUE; countNumber++) {
    		// float項目の値を出力する
            System.out.printf("%8.7f",floatNumber);
            // float項目の値を0.001ずつインクリメントしていく
            floatNumber += FLOAT_INCREMENT;

            // ２つの値の堺となる空白を出力する
            System.out.print("     ");

            // int項目の値をcountNumber÷1000の値でインクリメントしていく
            intNumber = (float) countNumber/THOUSAND_VALUE;
    		// int項目の値を出力する
            System.out.printf("%8.7f",intNumber);
    		// 改行を出力する
            System.out.println("");
        }
    }
}
