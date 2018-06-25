/**
 * 演習番号：演習4-9（P113）
 * 概要：正の整数値ｎを読み込んで、１からｎまでの積を求めるプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/25
 * 修正日：2018/06/25
 */
package e4_9;
import java.util.Scanner;

// 正の整数値ｎを読み込んで、１からｎまでの積を求めるクラス
public class E4_9 {
    // 正の整数値ｎを読み込んで、１からｎまでの積を求める
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 正の整数値の入力を促す文字列を画面に表示する
        System.out.print("nの値：");
        // 画面から入力された値をinputValueに格納する
        int inputValue = standardInput.nextInt();
        // １からｎまでの積を足しこんでいくための変数
        int outputValue = 1;
        // ループ回数を数えるための変数
        int countValue = 1;

        // inputValueに入力された回数ループする
        while (inputValue >= countValue) {
            // outputValueに積を足しこんでいく
            outputValue *= countValue;
            // 積の計算回数を数えていく
            countValue++;
        }
        // もし入力された値が０だった場合
        if (inputValue == 0) {
            // １×０＝０なので、積は０と表示する
            outputValue = 0;
        }
        // 足しこんでいった積を画面に表示する
        System.out.println("1から" + inputValue + "までの積は" + outputValue + "です。");
    }
}

