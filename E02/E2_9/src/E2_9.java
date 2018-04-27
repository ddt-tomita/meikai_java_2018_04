/********************************************************************************
 * 演習番号：演習2-9（P45）														*
 * 概要： 以下に示す３機能のプログラムを作成する。（実数値の乱数の生成にはnextDouble()を使うこと）	*
 * 			・0.0以上1.0未満の実数値をランダムに生成して表示。					*
 * 			・0.0以上10.0未満の実数値をランダムに生成して表示。					*
 *			・-1.0以上1.0未満の実数値をランダムに生成して表示。					*
 * 作成者：富田 涼子															*
 * 作成日：2018/04/27															*
 ********************************************************************************/

import java.util.Random;

public class E2_9 {

    public static void main(String[] args) {
        Random rand = new Random();

        // 0.0以上1.0未満の乱数用変数
        double RandomDouble1 = rand.nextDouble();    // 0.0以上1.0未満の範囲で乱数を生成する

        // 0.0以上10.0未満の乱数用変数
        double RandomDouble2 = rand.nextDouble();    // 0.0以上1.0未満の範囲で乱数を生成する
        int RandomInt2 = rand.nextInt(10);            // 0以上10未満の範囲で乱数を生成する

        // -1.0以上1.0未満の乱数用変数
        double RandomDouble3 = rand.nextDouble();    // 0.0以上1.0未満の範囲で乱数を生成する
        int RandomInt3 = rand.nextInt(2);                // 0以上2未満の範囲で乱数を生成する

        // 0.0以上1.0未満の乱数を画面に表示します。
        System.out.println("0.0以上1.0未満の乱数を表示します。" + RandomDouble1 + "です。");

        // 0.0以上10.0未満の乱数を画面に表示します。
        // RandomDouble2とRandomInt2それぞれの下限値を足すと0.0、それぞれの上限値を足すと9.9となります。
        System.out.println("0.0以上10.0未満の乱数を表示します。" + (RandomDouble2 + RandomInt2 ) + "です。");

        // -1.0以上1.0未満の乱数を画面に表示します。
        // RandomDouble3とRandomInt3それぞれの下限値を足すと0.0、それぞれの上限値を足すと1.9となります。
        // 上記からマイナス1すると、-1.0～0.9の範囲での乱数を生成できます。
        System.out.println("-1.0以上1.0未満の乱数を表示します。" + (RandomDouble3 + RandomInt3 -1) + "です。");
    }
}
