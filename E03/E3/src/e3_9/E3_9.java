/**
 * 演習番号：演習3-9（P71）
 * 概要：二つの実数値を読み込んで、大きいほうの値を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/06
 * 修正日：2018/06/06
 */package e3_9;

import java.util.Scanner;

//二つの実数値を読み込んで、大きいほうの値を表示するクラス
public class E3_9 {
    //二つの実数値を読み込んで、大きいほうの値を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 実数Aの入力を促す文字列を画面に表示する
        System.out.print("実数A：");
        // 実数Aの入力を画面から受け取り、変数inputValueAに格納する
        double inputValueA = standardInput.nextDouble();
        // 実数Bの入力を促す文字列を画面に表示する
        System.out.print("実数B：");
        // 実数Bの入力を画面から受け取り、変数inputValueBに格納する
        double inputValueB = standardInput.nextDouble();

        // 入力された実数を比べて、小さいほうの値を変数minValueに格納する
        double minValue = inputValueA < inputValueB ? inputValueA : inputValueB;
        //小さいほうの実数値を画面に表示する
        System.out.println("小さいほうの値は" + minValue + "です。");
    }
}
