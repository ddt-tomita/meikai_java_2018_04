/**
 * 演習番号：演習2-3
 * 概要：キーボードから読み込んだ整数をそのまま反復して表示する
 * 作成者：富田 涼子
 * 作成日：2018/04/25
 * 作成日：2018/05/02
 */

import java.util.Scanner;

// キーボードから読み込んだ整数をそのまま反復して表示するクラス
class Exercise2_3 {

    // キーボードから読み込んだ整数をそのまま反復して表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化
        Scanner standardInput = new Scanner(System.in);

        // 整数値の入力を促す文字列を出力する
        System.out.print("整数値：");
        // 画面から入力された整数値を変数numberに入れ初期化する
        int inputNumber = standardInput.nextInt();

        // 入力された値を画面に表示する
        System.out.println( inputNumber + "と入力しましたね。");
    }
}