/**
 * 演習番号：演習3-2（P59）
 * 概要：二つの正の整数値を読み込んで、後者が前者の約数であれば「BはAの約数です。」と表示し、
 * そうでなければ「BはAの約数ではありません。」と表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/05/02
 * 作成日：2018/05/02
 */
package e3_2;
import java.util.Scanner;

// 画面から入力された２つ目の整数が１つ目の整数の約数であるか判定するクラス
public class E3_2 {
	// 画面から入力された２つ目の整数が１つ目の整数の約数であるか判定する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化
        Scanner standardInput = new Scanner(System.in);

        // 整数Ａの入力を促す文字列を画面に表示する
        System.out.print("整数Ａ：");
        // 整数Ａの入力を画面から受け取り、変数integerValue1に入力文字列を格納する
        int integerValue1 = standardInput.nextInt();

        // 整数Ｂの入力を促す文字列を画面に表示する
        System.out.print("整数Ｂ：");
        // 整数Ｂの入力を画面から受け取り、変数integerValue2に入力文字列を格納する
        int integerValue2 = standardInput.nextInt();

        // 整数Ａ÷整数Ｂで余りが０ならばtrue
        if (integerValue1 % integerValue2 == 0) {
            // ＢはＡの約数であることを表示する
            System.out.println("ＢはＡの約数です。");
        // 整数Ａ÷整数Ｂで余りが０以外ならばtrue
        } else if(integerValue1 % integerValue2 != 0) {
            // ＢはＡの約数でないことを表示する
            System.out.println("ＢはＡの約数ではありません。");
        }
    }

}
