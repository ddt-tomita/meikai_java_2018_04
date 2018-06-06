/**
 * 演習番号：演習3-11（P71）
 * 概要：二つの整数値を読み込んで、それらの値の差が10以下であれば「それらの差は10以下です。」と表示し、
 *       そうでなければ「それらの差は11以上です。」と表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/06
 * 修正日：2018/06/06
 */package e3_11;

import java.util.Scanner;

//二つの整数値を読み込んで、それらの値の差が10以下か10以上かを表示するクラス
public class E3_11 {
    //二つの整数値を読み込んで、それらの値の差が10以下か10以上かを表示する
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
        // inputValueBのほうがinputValueAより小さいことを判定する
        } else if (inputValueB < inputValueA){
            // 大きいほうの値inputValueAから小さいほうの値inputValueBを引き、差を求める。
            marginValue = inputValueA - inputValueB;
        // inputValueAとinputValueBが同じ値であることを判定する
        } else if (inputValueA == inputValueB) {
            // 入力された２つの整数値が同じ値なので、差が0になる
            marginValue = 0;
        }

        // 入力された値の差が10以下であることを判定する
        if (marginValue <= 10) {
            // 画面から読み込んだ二つの整数値の差が10以下であることを出力する
            System.out.println("それらの差は10以下です。");
        // 入力された値の差が11以上である場合はこちらにくる
        } else {
            // 画面から読み込んだ二つの整数値の差が11以上であることを出力する
            System.out.println("それらの差は11以上です。");
        }
    }
}
