/**
 * 演習番号：演習5-5（P163）
 * 概要：三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 		 平均はキャスト演算子を利用し求め、実数として表示すること。
 * 作成者：富田 涼子
 * 作成日：2018/11/03
 * 修正日：2018/11/03
 */
package e5_5;

import java.util.Scanner;

// 三つの整数値を読み込んで、その合計と平均を表示するクラス
public class E5_5 {
    // 三つの整数値を読み込んで、その合計と平均を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を足しこんでいくための変数
        int sumValue = 0;
        // 合計値を割るための定数
        final int DIVIDE_VALUE = 3;

        // １つ目の整数値の入力を促す
        System.out.print("整数値１：");
        // 画面から入力された値をsumValueに格納する
        sumValue = standardInput.nextInt();

        // ２つ目の整数値の入力を促す
        System.out.print("整数値２：");
        // 画面から入力された値をsumValueに足しこむ
        sumValue += standardInput.nextInt();

        // ３つ目の整数値の入力を促す
        System.out.print("整数値３：");
        // 画面から入力された値をsumValueに足しこむ
        sumValue += standardInput.nextInt();

        // 三つの整数値の平均値を求める
        double averageValue = (double) sumValue / DIVIDE_VALUE;

        // 入力された三つの整数の合計値を出力する
        System.out.println("三つの整数の合計値は" + sumValue + "です。");
        // 入力された三つの整数の平均値の出力する
        System.out.println("三つの整数の平均値は" + averageValue + "です。");
    }
}
