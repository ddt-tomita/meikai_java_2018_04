/********************************************************************************
 * 演習番号：演習2-3															*
 * 概要： キーボードから読み込んだ整数をそのまま反復して表示する				*
 * 作成者：富田 涼子															*
 * 作成日：2018/04/25															*
 ********************************************************************************/

import java.util.Scanner;

class Exercise2_3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 整数値の入力を促す文字列を出力する
        System.out.println("整数値：");
        // 画面から入力された整数値を変数aに入れ初期化する
        int a = stdIn.nextInt();

        // 入力された値を画面に表示する
        System.out.println( a + "と入力しましたね。");
    }
}