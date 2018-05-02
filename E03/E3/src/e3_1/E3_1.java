/**
 * 演習番号：演習3-1（P59）
 * 概要：整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/05/02
 * 作成日：2018/05/02
 */
package e3_1;
import java.util.Scanner;

// 整数値を読み込んで、その絶対値を求めて表示するクラス
public class E3_1 {
    // 整数値を読み込んで、その絶対値を求めて表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化
        Scanner standardInput = new Scanner(System.in);
        // 整数値の入力を促す文字列を画面に表示する
        System.out.print("整数値：");
        // 整数値の入力を画面から受け取り、変数integerValueに入力文字列を格納する
        int integerValue = standardInput.nextInt();

        // 画面から入力された整数値の符号が正ならtrue
        if (integerValue > 0) {
	        // 画面に入力された値の絶対値を表示する
	        System.out.println("その絶対値は" + integerValue + "です");
        // 画面から入力された整数値の符号が正ならtrue
        } else if(integerValue < 0) {
	        // 画面に入力された値の絶対値を表示する
	        System.out.println("その絶対値は" + -integerValue + "です");
        }
    }

}
