/**
 * 演習番号：演習4-21（P125）
 * 概要：List4-16は左下側が直角の直角三角形を表示するプログラムであった。直角が左上側、右下側、右上側の
 *       三角形を表示するプログラムを作成せよ。
 *       ※直角が右下側
 * 作成者：富田 涼子
 * 作成日：2018/08/01
 * 修正日：2018/08/01
 */
package e4_21;
import java.util.Scanner;

// 直角が右上側にある直角三角形を表示するクラス
public class E4_21_3 {
    // 直角が右上側にある直角三角形を表示する
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
            System.out.print("右上直角の三角形を表示します。");
            // 段数の入力を促す
            System.out.print("段数は：");
            // 画面から入力された値をinputValueに格納する
            inputValue = standardInput.nextInt();
        }

        // 直角三角形の幅を管理する変数。
        int widthCountInt = 1;

        // 直角三角形の高さを管理するループ文。入力した値の数だけ繰り返す。
        for ( int heightInt = 1; heightInt <= inputValue; heightInt++) {
            // 直角三角形の幅を管理するループ文。入力した値の数だけ繰り返す。
            for ( int widthInt = 1; widthInt <= inputValue; widthInt++) {
                // 空白を出力するか*印を出力するかループ回数とwidthCountIntの値によって変化する
                if (widthInt < widthCountInt) {
                    // 画面に空文字を表示する
                    System.out.print(' ');
                } else {
                    // 画面に*を表示する
                    System.out.print('*');
                }
            }
            // 改行を行う
            System.out.println("");
            // 1行出力したら、次の幅を管理するループでは1プラスした数をループする
            widthCountInt++;
        }
    }
}
