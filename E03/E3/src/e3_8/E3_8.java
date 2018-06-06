/**
 * 演習番号：演習3-8（P69）
 * 概要：キーボードから読み込んだ点数に応じて、優／良／可／不可を判定して表示するプログラムを作成せよ。
 *       判定は以下のように行うこと。
 *       0～59→不可／60～69→可／70～79→良／80～100→優
 * 作成者：富田 涼子
 * 作成日：2018/05/30
 * 修正日：2018/06/06
 */package e3_8;

import java.util.Scanner;

//キーボードから読み込んだ点数に応じて、優／良／可／不可を判定して表示するクラス
public class E3_8 {
    //キーボードから読み込んだ点数に応じて、優／良／可／不可を判定して表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 点数の入力を促す文字列を画面に表示する
        System.out.print("点数を入力してください：");
        // 点数の入力を画面から受け取り、変数inputValueに入力文字列を格納する
        int inputValue = standardInput.nextInt();

        // 入力された点数の範囲が0～59であるかを判定する
        if (inputValue >= 0 && inputValue <= 59) {
            // 点数が0～59のため、「不可」と画面に表示する
            System.out.println("不可");
        // 入力された点数の範囲が60～69であるかを判定する
        } else if(inputValue >= 60 && inputValue <= 69) {
            // 点数が60～69のため、「可」と画面に表示する
            System.out.println("可");
        // 入力された点数の範囲が70～79であるかを判定する
        } else if(inputValue >= 70 && inputValue <= 79) {
            // 点数が70～79のため、「良」と画面に表示する
            System.out.println("良");
        // 入力された点数の範囲が80～100であるかを判定する
        } else if(inputValue >= 80 && inputValue <= 100) {
            // 点数が80～100のため、「優」と画面に表示する
            System.out.println("優");
        }
    }
}
