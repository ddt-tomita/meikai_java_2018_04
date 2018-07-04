/**
 * 演習番号：演習4-16（P121）
 * 概要：読み込んだ個数だけ*を表示するList4-11を書き換えて、5個表示するごとに改行するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/07/02
 * 修正日：2018/07/02
 */
package e4_16;
import java.util.Scanner;

// 読み込んだ個数だけ*を表示するクラス
public class E4_16 {
    // 読み込んだ個数だけ*を表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 何個*を表示するかをユーザーに入力してもらう
        System.out.print("何個*を表示しますか：");
        // 画面から入力された値をinputValueに格納する
        int inputValue = standardInput.nextInt();

        // ループ回数をカウントする変数
        int countInt = 0;
        // 改行時使用する値
        final int newLineValue = 5;

        // countIntの値がinputValueの値より小さい間、繰り返し処理を行う。
        while ( countInt < inputValue) {
            // 画面に*を表示する
            System.out.print('*');
            // countIntをインクリメントする
            countInt++;
            // countIntが5の値で割り切れる場合
            if ( countInt % newLineValue == 0) {
                // 改行処理を行う
                System.out.println("");
                // countIntの値がinputValueの値より小さい場合
                if(countInt < inputValue) {
                    // 画面に*を表示する
                    System.out.print('*');
                    // countIntをインクリメントする
                    countInt++;
                }
            }
        }
    }
}
