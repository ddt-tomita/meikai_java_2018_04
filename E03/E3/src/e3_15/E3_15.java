/**
 * 演習番号：演習3-15（P77）
 * 概要：二つの整数値を読みこんで降順(大きい順)にソートするプログラムを作成する
 * 作成者：富田 涼子
 * 作成日：2018/06/10
 * 修正日：2018/06/10
 */
package e3_15;

import java.util.Scanner;

//二つの整数値を読みこんで降順(大きい順)にソートするクラス
public class E3_15 {
    //二つの整数値を読みこんで降順(大きい順)にソートする
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 変数Aの入力を促す文字列を画面に表示する
        System.out.print("変数A：");
        // 変数Aの入力を画面から受け取り、variableValueAに格納する
        int variableValueA = standardInput.nextInt();
        // 変数Bの入力を促す文字列を画面に表示する
        System.out.print("変数B：");
        // 変数Bの入力を画面から受け取り、variableValueBに格納する
        int variableValueB = standardInput.nextInt();

        // variableValueAがvariableValueBよりも小さければ値の交換を行う
        if (variableValueA < variableValueB) {
            // 一時的に読み込んだ値を保管する変数
            int tempValue = 0;
            // tempValueにvariableValueAの値を退避させる
            tempValue = variableValueA;
            // 大きいほうの値variableValueBをvariableValueAに入れる
            variableValueA = variableValueB;
            // 退避していたtempValueの値variableValueAに入れる
            variableValueB = tempValue;
        }

        // ソート内容の表示をする
        System.out.println("変数A≧変数Bとなるようにソートしました。");
        // 大きいほうの値を表示をする
        System.out.println("変数Aは" + variableValueA + "です。");
        // 小さいほうの値を表示をする
        System.out.println("変数Bは" + variableValueB + "です。");

    }
}
