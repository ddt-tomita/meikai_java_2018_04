/**
 * 演習番号：演習4-3（P99）
 * 概要：二つの整数値を読み込んで、小さいほうの数以上で大きいほうの数以下の全整数を
 *       小さいほうから順に表示するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/13
 * 修正日：2018/06/13
 */
package e4_3;
import java.util.Scanner;

// 二つの整数値を読み込んで、小さいほうの数以上で大きいほうの数以下の全整数を小さいほうから順に表示するクラス
public class E4_3 {
    // 二つの整数値を読み込んで、小さいほうの数以上で大きいほうの数以下の全整数を小さいほうから順に表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 整数Aの入力を促す文字列を画面に表示する
        System.out.print("整数A：");
        // 整数Aの入力を画面から受け取り、inputValueAに格納する
        int inputValueA = standardInput.nextInt();
        // 整数Bの入力を促す文字列を画面に表示する
        System.out.print("整数B：");
        // 整数Bの入力を画面から受け取り、inputValueBに格納する
        int inputValueB = standardInput.nextInt();

        // 小さいほうの値を格納するための変数minValueを初期化する
        int minValue = 0;
        // 大きいほうの値を格納するための変数maxValueを初期化する
        int maxValue = 0;

        // 整数Aが整数Bよりも小さい場合
        if (inputValueA < inputValueB) {
            // 整数Aを小さいほうの値とする
            minValue = inputValueA;
            // 整数Bを大きいほうの値とする
            maxValue = inputValueB;
        // 整数Aが整数Bよりも大きい場合または同じ値の場合
        } else {
            // 整数Bを小さいほうの値とする
            minValue = inputValueB;
            // 整数Aを大きいほうの値とする
            maxValue = inputValueA;
        }

        // 小さいほうの数が画面から入力された大きいほうの数を上回るまで繰り返し処理を行う
        do {
            // 小さいほうの数に値を足しこみつつ、大きいほうの数までを画面に表示する
            System.out.print(minValue);
            // 小さいほうの数に1ずつ足しこみ、次に出力する値を生成する
            minValue = minValue + 1;
        // 次に出力する予定の値minValueがmaxValue以下の場合は繰り返し処理を行う
        } while ( minValue <= maxValue );
    }
}
