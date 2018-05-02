/**
 * 演習番号：演習2-2
 * 概要：三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/04/25
 * 作成日：2018/05/02
 */

// 三つのint型変数に値を代入し、合計と平均を求めるクラス
class Exercise2_2 {

    // 三つのint型変数に値を代入し、合計と平均を求める
    public static void main(String[] args) {
        int Integer1;        // Integer1はint型の変数
        int Integer2;        // Integer2はint型の変数
        int Integer3;        // Integer3はint型の変数

        Integer1 = 10;        // Integer1に10を代入
        Integer2 = 20;        // Integer2に20を代入
        Integer3 = 30;        // Integer3に30を代入

        // 変数Integer1,Integer2,Integer3を足して合計の値を画面に出力する
        System.out.println("合計は" + (Integer1 + Integer2 + Integer3)  + "です。");
        // 変数Integer1,Integer2,Integer3を足して3で割って平均の値を画面に出力する
        System.out.println("平均は" + (Integer1 + Integer2 + Integer3) / 3 + "です。");
    }
}