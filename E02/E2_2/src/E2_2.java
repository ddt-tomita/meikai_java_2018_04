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
        int int1st;        // int1stはint型の変数
        int int2nd;        // int2ndはint型の変数
        int int3rd;        // int3rdはint型の変数

        int1st = 10;        // int1stに10を代入
        int2nd = 20;        // int2ndに20を代入
        int3rd = 30;        // int3rdに30を代入

        // 変数int1st,int2nd,int3rdを足して合計の値を画面に出力する
        System.out.println("合計は" + (int1st + int2nd + int3rd)  + "です。");
        // 変数int1st,int2nd,int3rdを足して3で割って平均の値を画面に出力する
        System.out.println("平均は" + (int1st + int2nd + int3rd) / 3 + "です。");
    }
}