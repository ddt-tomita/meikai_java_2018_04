/**
 * 演習番号：演習4-19（P125）
 * 概要：季節を求めるList4-1の月の読み込みにおいて、1～12以外の値が入力された場合は、再入力させるように
 *       修正したプログラムを作成せよ。(do文の中にdo文が入る二重ループとなる)
 * 作成者：富田 涼子
 * 作成日：2018/07/04
 * 修正日：2018/07/04
 */
package e4_19;

import java.util.Scanner;

//入力された月の季節を表示するクラス
public class E4_19 {
    //入力された月の季節を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化を行う
        Scanner standardInput = new Scanner(System.in);
        // リトライ判定変数
        int retry = 0;
        // 画面から入力された値を格納する変数
        int inputValue = 0;

        // 1月表す変数
        final int JANUARY = 1;
        // 2月を表す変数
        final int FEBRUARY = 2;
        // 3月を表す変数
        final int MARCH  = 3;
        // 5月を表す変数
        final int MAY = 5;
        // 6月を表す変数
        final int JUNE = 6;
        // 8月を表す変数
        final int AUGUST = 8;
        // 9月を表す変数
        final int SEPTEMBER = 9;
        // 11月を表す変数
        final int NOVEMBER = 11;
        // 12月を表す変数
        final int DECEMBER = 12;

        // ユーザが終了を選択するまでループし続ける
        do {
            // 条件に合致するまで、繰り返し処理を行う
            do {
                // 月の入力を促す
                System.out.print("季節を求めます。\n何月ですか：");
                // 画面から入力された値をinputValueに格納する
                inputValue = standardInput.nextInt();

            // 入力された値が1～12以外の場合、再入力させる
            } while (inputValue < JANUARY || inputValue > DECEMBER);

            // 3・4・5月を選択された場合
            if (inputValue >= MARCH && inputValue <= MAY) {
                // 入力月の季節を答える
                System.out.println("それは春です。");

            // 6・7・8月を選択された場合
            } else if (inputValue >= JUNE && inputValue <= AUGUST) {
                // 入力月の季節を答える
                System.out.println("それは夏です。");

            // 9・10・11月を選択された場合
            } else if (inputValue >= SEPTEMBER && inputValue <= NOVEMBER) {
                // 入力月の季節を答える
                System.out.println("それは秋です。");

            // 12・1・2月を選択された場合
            } else if (inputValue == DECEMBER || inputValue == JANUARY || inputValue == FEBRUARY) {
                // 入力月の季節を答える
                System.out.println("それは冬です。");
            }

            // 入力者にもう一度処理を行うか問う
            System.out.print("もう一度？ 1…Yes／0…No：");
            // 画面から入力された値をretryに格納する
            retry = standardInput.nextInt();

        // 入力者がYesを選択した際は処理を繰り返す
        } while (retry == 1);

    }
}
