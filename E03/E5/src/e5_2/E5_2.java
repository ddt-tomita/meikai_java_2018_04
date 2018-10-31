/**
 * 演習番号：演習5-2（P153）
 * 概要：float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/10/31
 * 修正日：2018/10/31
 */
package e5_2;

import java.util.Scanner;

// float型の変数とdouble型の変数に値を読み込んで表示するクラス
public class E5_2 {
    // float型の変数とdouble型の変数に値を読み込んで表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        double doubleValue = 0;
        // 画面から入力された値を格納する変数
        float floatValue = 0;
        // プログラムの説明を行う
        System.out.println("変数floatValueはfloat型で、変数doubleValueはdouble型です。");

        // 変数floatValueの入力を促す
        System.out.print("floatValue：");
        // 画面から入力された変数floatValueをinputValueに格納する
        floatValue = standardInput.nextFloat();
        // 変数doubleValueの入力を促す
        System.out.print("doubleValue：");
        // 画面から入力された変数doubleValueをinputValueに格納する
        doubleValue = standardInput.nextDouble();

        // 入力された変数floatValueの値を出力する
        System.out.println("floatValue＝" + floatValue);
        // 入力された変数doubleValueの値を出力する
        System.out.println("doubleValue＝" + doubleValue);

    }
}
