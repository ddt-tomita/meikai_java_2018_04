/**
 * 演習番号：演習4-23（P125）
 * 概要：n段のピラミッドを表示するプログラムを作成せよ。第i行目にはi%10を表示すること。
 * 作成者：富田 涼子
 * 作成日：2018/08/01
 * 修正日：2018/08/20
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
        final int VALUE_ZERO = 0;

        // 以下、繰り返し処理
        do {
            // プログラムの説明を行います。
            System.out.println("ピラミッドを表示します。");
            // 段数の入力を促す
            System.out.print("段数は：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        // 画面から入力された値が０以上であれば終了
        } while (inputValue <= VALUE_ZERO);

        // 現在のピラミッドの行数をあらわす変数
        int pyramidNowRow = 1;
        // ピラミッドの幅をあらわす変数
        int pyramidWidthCountInt = 0;
        // スペースの数をあらわす変数
        int spaceCountInt = inputValue;
        // ピラミッドの段数をあらわす変数
        int pyramidNumberOfStages = pyramidNowRow % 10;

        // ピラミッドの高さを管理するループ文。入力した値の数だけ繰り返す。
        for (int heightInt = 1; heightInt <= inputValue; heightInt++) {
            // ピラミッドの幅をここで決める
            pyramidWidthCountInt = (pyramidNowRow - 1) * 2 + 1;
            // ピラミッドの左側のスペース部を管理するループ文。
            for (int spaceInt = 1; spaceInt <= spaceCountInt; spaceInt++) {
                // 画面にスペースを表示する
                System.out.print(' ');
            }
            // ピラミッド本体を管理するループ文
            for (int widthInt = 0; widthInt < pyramidWidthCountInt; widthInt++) {
                // 画面に段数の数字を表示する
                System.out.print(pyramidNumberOfStages);
            }
            // 改行を行う
            System.out.println("");
            // 1行出力したら、スペース部を1減らす
            spaceCountInt--;
            // 次のピラミッドの行数を設定する
            pyramidNowRow++;
            // 次のピラミッドの段数を設定する
            pyramidNumberOfStages = pyramidNowRow % 10;
        }
    }
}
