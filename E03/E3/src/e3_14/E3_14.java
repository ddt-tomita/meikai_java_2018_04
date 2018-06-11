/**
 * 演習番号：演習3-14（P77）
 * 概要：二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示するプログラムを作成する。
 *       ただし、二つの整数値が等しい場合には、「二つの値は同じです。」と表示する。
 * 作成者：富田 涼子
 * 作成日：2018/06/10
 * 修正日：2018/06/10
 */
package e3_14;

import java.util.Scanner;

//二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示するクラス
public class E3_14 {
    //二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 整数Aの入力を促す文字列を画面に表示する
        System.out.print("整数A：");
        // 整数Aの入力を画面から受け取り、変数inputValueAに格納する
        int inputValueA = standardInput.nextInt();
        // 整数Bの入力を促す文字列を画面に表示する
        System.out.print("整数B：");
        // 整数Bの入力を画面から受け取り、変数inputValueBに格納する
        int inputValueB = standardInput.nextInt();

        // 小さいほうの値を格納するための変数minValueを初期化する
        int minValue = 0;
        // 大きいほうの値を格納するための変数maxValueを初期化する
        int maxValue = 0;

        // inputValueAがinputValueBよりも小さいことを判定する
        if (inputValueA < inputValueB) {
            // inputValueAがinputValueBよりも小さければminValueにinputValueAを格納する
            minValue = inputValueA;
            // inputValueAがinputValueBよりも小さければmaxValueにinputValueBを格納する
            maxValue = inputValueB;
            // 画面から読み込んだ小さいほうの整数値を出力する
            System.out.println("小さいほうの値は" + minValue + "です。");
            // 画面から読み込んだ大きいほうの整数値を出力する
            System.out.println("大きいほうの値は" + maxValue + "です。");
        // inputValueAがinputValueBよりも大きいことを判定する
        } else if (inputValueA > inputValueB) {
            // inputValueAがinputValueBよりも大きければminValueにinputValueBを格納する
            minValue = inputValueB;
            // inputValueAがinputValueBよりも大きければmaxValueにinputValueAを格納する
            maxValue = inputValueA;
            // 画面から読み込んだ小さいほうの整数値を出力する
            System.out.println("小さいほうの値は" + minValue + "です。");
            // 画面から読み込んだ大きいほうの整数値を出力する
            System.out.println("大きいほうの値は" + maxValue + "です。");
        // 二つの値が等しい場合
        } else {
            // 画面から読み込んだ整数値が等しいことを出力する
            System.out.println("二つの値は同じです。");
        }

    }
}
