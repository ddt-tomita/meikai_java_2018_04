/**
 * 演習番号：演習2-5（P41）
 * 概要：二つの実数値を読み込み、その和と平均を求めて表示する
 * 作成者：富田 涼子
 * 作成日：2018/04/27
 * 作成日：2018/05/02
 */

import java.util.Scanner;

// 二つの実数値を読み込み、その和と平均を求めて表示するクラス
class E2_5 {

    // 二つの実数値を読み込み、その和と平均を求めて表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化
        Scanner StandardInput = new Scanner(System.in);

        // xの値の入力を促す
        System.out.println("xの値：");
        double x = StandardInput.nextDouble();  // xに実数値を読み込む

        // yの値の入力を促す
        System.out.println("yの値：");
        double y = StandardInput.nextDouble();  // yに実数値を読み込む

        // 画面から入力されたxの値とyの値から合計値を表示する
        System.out.println("合計は" + (x + y)  + "です。");
        // 画面から入力されたxの値とyの値から平均値を表示する
        System.out.println("平均は" + (x + y) / 2 + "です。");
    }
}