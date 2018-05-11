/**
 * 演習番号：演習3-4（P61）
 * 概要：二つの変数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 *       「aのほうが大きいです。」「bのほうが大きいです。」「aとbは同じ値です。」
 * 作成者：富田 涼子
 * 作成日：2018/05/11
 * 作成日：2018/05/11
 */
package e3_4;
import java.util.Scanner;

//二つの読み込まれた変数を比べて、その大小関係を画面に表示するためのクラス
public class E3_4 {
    //二つの読み込まれた変数を比べて、その大小関係を画面に表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 変数aの値の入力を促す文字列を画面に表示する
        System.out.print("aの値：");
        // 変数aの入力を画面から受け取り、変数integerValueに入力文字列を格納する
        int aValue = standardInput.nextInt();
        // 変数bの値の入力を促す文字列を画面に表示する
        System.out.print("bの値：");
        // 変数bの入力を画面から受け取り、変数integerValueに入力文字列を格納する
        int bValue = standardInput.nextInt();

        // aの値とbの値に差異があるかの判定をする
        if (aValue != bValue) {
            // aの値とbの値を比べて、aのほうが大きいことを判定をする
            if (aValue > bValue) {
                // 画面から入力された変数aのほうが大きいことを画面に出力する
                System.out.println("aのほうが大きいです。");
            // aの値とbの値を比べて、bのほうが大きいことを判定をする
            } else if (aValue < bValue) {
                // 画面から入力された変数bのほうが大きいことを画面に出力する
                System.out.println("bのほうが大きいです。");
            }
        // aの値とbの値に差異がないことを判定をする
        } else if(aValue == bValue) {
            // 画面から入力された変数aとbが同じ値だということを画面に出力する
            System.out.println("aとbは同じ値です。");
        }
    }
}
