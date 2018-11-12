/**
 * 演習番号：演習5-7（P169）
 * 概要：0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/11/12
 * 修正日：2018/11/12
 */
package e5_7;

// 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するクラス
public class E5_7 {

	// 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示する
    public static void main(String[] args) {

    	// 項目名を出力する
        System.out.println("   値１         値２");
    	// ヘッダの区切りを出力する
        System.out.println("------------------------------");

    	// 1000の値を意味する定数
        final int THOUSAND_VALUE = 1000;
    	// float型に足しこんでいく定数
        final float FLOAT_INCREMENT = 0.001F;

        // float項目に出力する変数
    	long floatNumber = 0;
        // int項目に出力する変数
    	double intNumber = 0;

    	// float項目とint項目をインクリメントしていくために1000回のループを行う
    	for (int countNumber = 0; countNumber <= THOUSAND_VALUE; countNumber++) {
            // int項目の値をcountNumber÷1000の値でインクリメントしていく
            intNumber = (double) countNumber/THOUSAND_VALUE;
    		// int項目の値を出力する
//            System.out.printf("%8.7f",intNumber);
            System.out.print(intNumber);

            // ２つの値の堺となる空白を出力する
            System.out.print("     ");

            // float項目の値を0.001ずつインクリメントしていく
            floatNumber = (long) (intNumber*intNumber);
    		// float項目の値を出力する
//            System.out.printf("%8.7f",floatNumber);
            System.out.print(floatNumber);

    		// 改行を出力する
            System.out.println("");

        }
    }
}
