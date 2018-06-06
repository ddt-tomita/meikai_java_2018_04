/**
 * 演習番号：演習3-10（P71）
 * 概要：二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/06
 * 修正日：2018/06/06
 */package e3_10;

import java.util.Scanner;

//二つの整数値を読み込んで、それらの値の差を表示するクラス
public class E3_10 {
    //二つの整数値を読み込んで、それらの値の差を表示する
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

        // 二つの整数値の差を格納する、変数marginValueを定義する
        int marginValue = 0;

        // inputValueAのほうがinputValueBより小さいことを判定する
        if (inputValueA < inputValueB) {
            // 大きいほうの値inputValueBから小さいほうの値inputValueAを引き、差を求める。
            marginValue = inputValueB - inputValueA;
        // inputValueBのほうがinputValueAより小さい場合と、二つの入力値が同じ値の場合はこちらに入る
        } else {
            // 大きいほうの値(または同じ値)inputValueAから小さいほうの値(または同じ値)inputValueBを引き、差を求める。
            marginValue = inputValueA - inputValueB;
        }

        // 画面から読み込んだ二つの整数値の差を出力する
        System.out.println("二つの整数値の値の差は" + marginValue + "です。");
    }
}
