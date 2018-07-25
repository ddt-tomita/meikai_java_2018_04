/**
 * 演習番号：演習4-17（P121）
 * 概要：読み込んだ整数値のすべての約数を表示するList4-13を書き換えて、約数の表示が終わった後に、
 *       約数の個数を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/07/04
 * 修正日：2018/07/04
 */
package e4_17;
import java.util.Scanner;

// 読み込んだ整数値のすべての約数を表示するクラス
public class E4_17 {
    // 読み込んだ整数値のすべての約数を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        int inputValue = 0;
        // 入力された値を制限するための変数
        int valueZero = 0;

        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValue <= valueZero) {
            // 整数値の入力を促す
            System.out.print("整数値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // 約数の個数をカウントする変数
        int divisorCount = 0;

        // 計算している約数の値が読み込んだ整数値をこえるまで繰り返し処理を行う。
        for ( int divisorInt = 1; divisorInt <= inputValue; divisorInt++) {
            // 読み込んだ整数値がdivisorIntで割り切れたら約数
            if (inputValue % divisorInt == 0) {
                // 画面に約数を表示する
                System.out.println(divisorInt);
                // 約数の個数をカウントしていく
                divisorCount++;
            }
        }
        // 最後に約数の個数を表示する
        System.out.println("約数は" + divisorCount + "個です。");
    }
}
