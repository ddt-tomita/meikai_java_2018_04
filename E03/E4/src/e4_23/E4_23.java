/**
 * 演習番号：演習4-23（P125）
 * 概要：n段のピラミッドを表示するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/08/01
 * 修正日：2018/08/01
 */
package e4_23;

import java.util.Scanner;

// n段のピラミッドを表示するクラス
public class E4_23 {
    // n段のピラミッドを表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 画面から入力された値を格納する変数
        int inputValue = 0;
        // 入力された値を制限するための変数
        int valueZero = 0;

        // 画面から入力された値が０以下であれば繰り返し処理を行う
        while (inputValue <= valueZero) {
            // プログラムの説明を行います。
            System.out.println("ピラミッドを表示します。");
            // 段数の入力を促す
            System.out.print("段数は：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // 現在の行数をあらわす変数
        int nowRow = 1;
        // ピラミッドの幅をあらわす変数
        int widthCountInt = 0;
        // スペースの数をあらわす変数
        int spaceCountInt = inputValue;
        //
        int a = nowRow % 10;

        // ピラミッドの高さを管理するループ文。入力した値の数だけ繰り返す。
        for (int heightInt = 1; heightInt <= inputValue; heightInt++) {
            // ピラミッドの幅をここで決める
            widthCountInt = (nowRow - 1) * 2 + 1;
            // ピラミッドの左側のスペース部を管理するループ文。
            for (int spaceInt = 1; spaceInt <= spaceCountInt; spaceInt++) {
                // 画面にスペースを表示する
                System.out.print(' ');
            }
            // ピラミッド本体を管理するループ文
            for (int widthInt = 0; widthInt < widthCountInt; widthInt++) {
                // 画面に*を表示する
                System.out.print(a);
            }
            // 改行を行う
            System.out.println("");
            // 1行出力したら、スペース部を1減らす
            spaceCountInt--;
            // 次の行数を設定する
            nowRow++;
        }
    }
}
