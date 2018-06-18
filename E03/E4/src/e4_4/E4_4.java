/**
 * 演習番号：演習4-4（P101）
 * 概要：List4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/13
 * 修正日：2018/06/13
 */
package e4_4;
import java.util.Scanner;

// List4-4のwhile文終了時にxの値が-1になることを確認するクラス
public class E4_4 {
    // List4-4のwhile文終了時にxの値が-1になることを確認する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 正の整数値の入力を促す文字列を画面に表示する
        System.out.print("正の整数値：");
        // 正の整数値の入力を画面から受け取り、countDownValueに格納する
        int countDownValue = standardInput.nextInt();

        // 小さいほうの数が画面から入力された大きいほうの数を上回るまで繰り返し処理を行う
        while (countDownValue >= 0) {
            // 小さいほうの数に値を足しこみつつ、大きいほうの数までを画面に表示する
            System.out.println(countDownValue);
            // 小さいほうの数に1ずつ足しこみ、次に出力する値を生成する
            countDownValue--;
        }
        // while文終了時の変数countDownValueの値を画面に表示する
        System.out.print("最後の値は"+countDownValue);
    }
}
