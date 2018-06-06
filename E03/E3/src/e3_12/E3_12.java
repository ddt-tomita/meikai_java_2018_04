/**
 * 演習番号：演習3-12（P73）
 * 概要：キーボードから読み込んだ三つの整数値を求めて表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/06
 * 修正日：2018/06/06
 */package e3_12;

import java.util.Scanner;

//キーボードから読み込んだ三つの整数値を求めて表示するクラス
public class E3_12 {
    //キーボードから読み込んだ三つの整数値を求めて表示する
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
        // 整数Cの入力を促す文字列を画面に表示する
        System.out.print("整数C：");
        // 整数Cの入力を画面から受け取り、変数inputValueCに格納する
        int inputValueC = standardInput.nextInt();

        // 三つの整数値の中で一番小さい数を格納するための変数minValueを初期化する
        int minValue = 0;

        // inputValueAをminValueと仮定する
        minValue = inputValueA;
        // inputValueBがminValueよりも小さければminValueにinputValueBを格納する
        if (inputValueB < minValue) minValue = inputValueB;
        // inputValueCがminValueよりも小さければminValueにinputValueCを格納する
        if (inputValueC < minValue) minValue = inputValueC;

        // 画面から読み込んだ一番小さい整数値を出力する
        System.out.println("最小値は" + minValue + "です。");
    }
}
