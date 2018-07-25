/**
 * 演習番号：演習4-18（P121）
 * 概要：1からnまでの整数値の2乗値を表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/07/04
 * 修正日：2018/07/04
 */
package e4_18;
import java.util.Scanner;

// 1からnまでの整数値の2乗値を表示するクラス
public class E4_18 {
    // 1からnまでの整数値の2乗値を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        int inputValue = 0;
        // 入力された値を制限するための変数
        int valueZero = 0;

        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValue <= valueZero) {
            // 値の入力を促す
            System.out.print("nの値：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // 2乗した値を格納する変数
        int answerInt = 0;

        // 画面から入力された値の数だけループする
        for ( int countInt = 1; countInt <= inputValue; countInt++) {
            // 2乗した値を格納する
            answerInt = countInt * countInt;
            // nの2乗値を画面に出力する
            System.out.println(countInt + "の2乗は" + answerInt);
        }
    }
}
