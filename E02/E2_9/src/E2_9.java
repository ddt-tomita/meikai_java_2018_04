/**
 * 演習番号：演習2-9（P45）
 * 概要：以下に示す３機能のプログラムを作成する。（実数値の乱数の生成にはnextDouble()を使うこと）
 *          ・0.0以上1.0未満の実数値をランダムに生成して表示。
 *          ・0.0以上10.0未満の実数値をランダムに生成して表示。
 *          ・-1.0以上1.0未満の実数値をランダムに生成して表示。
 * 作成者：富田 涼子
 * 作成日：2018/04/27
 * 作成日：2018/05/02
 */

import java.util.Random;

// ３種類の乱数を生成して表示するためのクラス
public class E2_9 {

    // ３種類の乱数を生成して表示する
    public static void main(String[] args) {
        // ランダムクラスのインスタンス生成
        Random random = new Random();

        // 0.0以上1.0未満の乱数用変数
        double randomDouble1 = random.nextDouble();     // 0.0以上1.0未満の範囲で乱数を生成する
        // 0.0以上1.0未満の出力用変数
        double outputRandomNumber1 = randomDouble1;    // 0.0以上1.0未満の出力用変数

        // 0.0以上10.0未満の乱数用変数
        double randomDouble2 = random.nextDouble();    // 0.0以上1.0未満の範囲で乱数を生成する
        int randomInt2 = random.nextInt(10);            // 0以上10未満の範囲で乱数を生成する
        // RandomDouble2とRandomInt2それぞれの下限値を足すと0.0、それぞれの上限値を足すとrandomInt2となります。
        double outputRandomNumber2 = randomDouble2 + randomInt2;    // 0.0以上10.0未満の出力用変数

        // -1.0以上1.0未満の乱数用変数
        double randomDouble3 = random.nextDouble();    // 0.0以上1.0未満の範囲で乱数を生成する
        int randomInt3 = random.nextInt(2);                // 0以上2未満の範囲で乱数を生成する
        // RandomDouble3とRandomInt3それぞれの下限値を足すと0.0、それぞれの上限値を足すと1.9となります。
        // 上記からマイナス1すると、-1.0～0.9の範囲での乱数を生成できます。
        double outputRandomNumber3 = randomDouble3 + randomInt3 -1; // -1.0以上1.0未満の出力用変数

        // 0.0以上1.0未満の乱数を画面に表示します。
        System.out.println("0.0以上1.0未満の乱数を表示します。" + outputRandomNumber1 + "です。");

        // 0.0以上10.0未満の乱数を画面に表示します。
        System.out.println("0.0以上10.0未満の乱数を表示します。" + outputRandomNumber2 + "です。");

        // -1.0以上1.0未満の乱数を画面に表示します。
        System.out.println("-1.0以上1.0未満の乱数を表示します。" + outputRandomNumber3 + "です。");
    }
}
