/**
 * 演習番号：演習3-16（P77）
 * 概要：三つの整数値を読みこんで昇順(小さい順)にソートするプログラムを作成する
 * 作成者：富田 涼子
 * 作成日：2018/06/10
 * 修正日：2018/06/10
 */
package e3_16;

import java.util.Scanner;

//三つの整数値を読みこんで昇順(小さい順)にソートするクラス
public class E3_16 {
    //三つの整数値を読みこんで昇順(小さい順)にソートする
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
        // 変数Cの入力を促す文字列を画面に表示する
        System.out.print("変数C：");
        // 変数Cの入力を画面から受け取り、variableValueCに格納する
        int variableValueC = standardInput.nextInt();

        // 一時的に読み込んだ値を保管する変数
        int tempValue = 0;

        //★バブルソートで並び替えを行っていく
        // 変数Aが変数Bよりも大きければ値の交換を行う
        if (variableValueA > variableValueB) {
            // tempValueに変数Aの値を退避させる
            tempValue = variableValueA;
            // 小さいほうの値変数Bを変数Aに入れる
            variableValueA = variableValueB;
            // 退避していたtempValueの値変数Aに入れる
            variableValueB = tempValue;
        }
        // 変数Bが変数Cよりも大きければ値の交換を行う
        if (variableValueB > variableValueC) {
            // tempValueに変数Bの値を退避させる
            tempValue = variableValueB;
            // 小さいほうの値変数Cを変数Bに入れる
            variableValueB = variableValueC;
            // 退避していたtempValueの値変数Cに入れる
            variableValueC = tempValue;
        }
        // 変数Aが変数Bよりも大きければ値の交換を行う
        if (variableValueA > variableValueB) {
            // tempValueに変数Aの値を退避させる
            tempValue = variableValueA;
            // 小さいほうの値変数Bを変数Aに入れる
            variableValueA = variableValueB;
            // 退避していたtempValueの値変数Aに入れる
            variableValueB = tempValue;
        }

        // ソート内容の表示をする
        System.out.println("変数A≦変数B≦変数Cとなるようにソートしました。");
        // １番小さい値を表示をする
        System.out.println("変数Aは" + variableValueA + "です。");
        // ２番目に小さい値を表示をする
        System.out.println("変数Bは" + variableValueB + "です。");
        // ３番目に小さい値を表示をする
        System.out.println("変数Cは" + variableValueC + "です。");

    }
}
