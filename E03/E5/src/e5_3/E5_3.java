/**
 * 演習番号：演習5-3（P157）
 * 概要：論理型の変数にtrueやfalseを代入して、その値を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/10/31
 * 修正日：2018/10/31
 */
package e5_3;

import java.util.Scanner;

// 論理型の変数にtrueやfalseを代入して、その値を表示するクラス
public class E5_3 {
    // 論理型の変数にtrueやfalseを代入して、その値を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        double inputValue = 0;
        // 1の値を表す定数
        final int NUMBER_ONE = 1;
        // 入力された値が１以上か判定する論理型
        boolean booleanType = false;
        // プログラムの説明を行う
        System.out.println("入力した値が１以上ならTrueを返します");

        // 整数値の入力を促す
        System.out.print("整数値：");

        // 画面から入力された値をinputValueに格納する
        inputValue = standardInput.nextInt();
        // 入力された値1以上なら論理型の変数booleanTypeにtrueを代入
        booleanType = (inputValue >= NUMBER_ONE);
        // 入力された値1未満なら論理型の変数booleanTypeにfalseを代入
        // (初期値がfalseですが、今回は代入が目的なので )
        booleanType = (inputValue < NUMBER_ONE);

        // 入力された変数booleanTypeの値を出力する
        System.out.println("booleanType＝" + booleanType);

    }
}
