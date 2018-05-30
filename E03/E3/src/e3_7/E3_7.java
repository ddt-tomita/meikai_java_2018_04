/**
 * 演習番号：演習3-7（P61）
 * 概要：正の整数値を読み込んで、それを3で割った値に応じて「その値は3で割り切れます。」
 *       「その値を3で割った余りは1です。」「その値を3で割った余りは2です。」のいずれかを表示するプログラムを作成せよ。
 *       ※正でない値を読み込んだ場合は、「正でない値が入力されました。」と表示すること。
 * 作成者：富田 涼子
 * 作成日：2018/05/30
 * 修正日：2018/05/30
 */package e3_7;

import java.util.Scanner;

//画面から入力された整数値を読み込んで、それを3で割った値の余りを画面に表示するためのクラス
public class E3_7 {
    //画面から入力された整数値を読み込んで、それを3で割った値の余りを画面に表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 正の整数値の入力を促す文字列を画面に表示する
        System.out.print("正の整数値：");
        // 正の整数値の入力を画面から受け取り、変数inputValueに入力文字列を格納する
        int inputValue = standardInput.nextInt();
        // ３で割った余りの値を格納する、変数remainderValueを定義する
        int remainderValue;

        // 入力された値が正の整数値であるかを判定する
        if (inputValue > 0) {
            // 入力された値を３で割って余りがでないことを判定をする
            if (inputValue % 3 == 0) {
                // 入力された値が３で割り切れるということを画面に出力する
                System.out.println("その値は3で割り切れます。");
            // それ以外の３で割り切れない値は、余りを表示するのでこちらに分岐する
            } else {
                // 画面に表示する用の余りの数を変数remainderValueに格納する
                remainderValue = inputValue % 3;
                // 入力された値を３で割った余りの値を画面に出力する
                System.out.println("その値を3で割った余りは" + remainderValue + "です。");
            }
        // 入力された値が正の整数値でないことを判定する
        } else if(inputValue < 1) {
            // 入力された値が正でないということを画面に出力する
            System.out.println("正でない値が入力されました。");
        }
    }
}
