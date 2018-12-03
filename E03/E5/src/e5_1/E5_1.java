/**
 * 演習番号：演習5-1（P149）
 * 概要：10進整数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/10/29
 * 修正日：2018/10/31
 */
package e5_1;

import java.util.Scanner;

// 10進整数を読み込んで、その値を8進数と16進数で表示するクラス
public class E5_1 {
    // 10進整数を読み込んで、その値を8進数と16進数で表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        int inputValue = 0;
        // 整数値の入力を促す
        System.out.print("整数：");
        // 画面から入力された値をinputValueに格納する
        inputValue = standardInput.nextInt();

        // 入力された値の8進数を出力する
        System.out.printf("8進数では%oです。\n",inputValue);
        // 入力された値の16進数を出力する
        System.out.printf("16進数では%xです。",inputValue);
    }
}
