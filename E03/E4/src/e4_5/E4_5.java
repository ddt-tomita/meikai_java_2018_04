/**
 * 演習番号：演習4-5（P105）
 * 概要：List4-5のx--が--xとなっていたら、どのような出力が得られるか検討せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/18
 * 修正日：2018/06/18
 */
package e4_5;
import java.util.Scanner;

// List4-5のx--が--xとなっていたら、どのような出力が得られるか確認するクラス
public class E4_5 {
    // List4-5のx--が--xとなっていたら、どのような出力が得られるか確認する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // これから行う処理を画面に表示する
        System.out.println("カウントダウンします。");
        // 画面から入力されたカウントダウンに使う値を格納する変数
        int countDownValue = 0;

        // 以下、繰り返し行う処理
        do {
            // 正の整数値の入力を促す文字列を画面に表示する
            System.out.print("正の整数値：");
            // 正の整数値の入力を画面から受け取り、countDownValueに格納する
            countDownValue = standardInput.nextInt();
        // 画面から入力された値が0以下の場合は繰り返し入力を促す
        } while(countDownValue <= 0);

        // countDownValueの値が0以上の間、繰り返し処理を行う。
        while (countDownValue >= 0) {
            // 入力された値から、カウントダウンを行う
            System.out.println(--countDownValue);
        }
    }
}
//★検証結果
//  List4-5のパターンは、画面出力処理実行後にデクリメントが行われるため評価前の値が画面に出力されるが、
//  今回のパターンは、画面出力処理実行前にデクリメントが行われるため評価時の値が画面に表示される。
