/**
 * 演習番号：演習3-18（P83）
 * 概要：月を1～12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/10
 * 修正日：2018/06/10
 */
package e3_18;

import java.util.Scanner;

//季節を判定するクラス
public class E3_18 {
    //入力した月から季節を判定します
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化を行う
        Scanner standardInput = new Scanner(System.in);

        // 月の入力を促す
        System.out.print("月を整数値で入力してください：");
        // 月の入力を画面から受け取り、inputMonthに格納する
        int inputMonth = standardInput.nextInt();

        // 1月表す変数
        final int january = 1;
        // 2月を表す変数
        final int february = 2;
        // 3月を表す変数
        final int march  = 3;
        // 4月を表す変数
        final int april = 4;
        // 5月を表す変数
        final int may = 5;
        // 6月を表す変数
        final int june = 6;
        // 7月を表す変数
        final int july = 7;
        // 8月を表す変数
        final int august = 8;
        // 9月を表す変数
        final int september = 9;
        // 10月を表す変数
        final int october = 10;
        // 11月を表す変数
        final int november = 11;
        // 12月を表す変数
        final int december = 12;

        // 入力された月から季節を判定する
        switch ( inputMonth ){
            // 3月から5月が入力された場合
            case march:
            case april:
            case may:
                // 春と表示する
                System.out.println("春です。");
                // switch文から抜ける
                break;
            // 6月から8月が入力された場合
            case june:
            case july:
            case august:
                // 夏と表示する
                System.out.println("夏です。");
                // switch文から抜ける
                break;
            // 9月から11月が入力された場合
            case september:
            case october:
            case november:
                // 秋と表示する
                System.out.println("秋です。");
                // switch文から抜ける
                break;
            // 12月から2月が入力された場合
            case december:
            case january:
            case february:
                // 冬と表示する
                System.out.println("冬です。");
                // switch文から抜ける
                break;
            // それ以外の値が入力された場合
            default :
                // 1月から12月しか月はないです
                System.out.println("そんな月はありません。");
                // switch文から抜ける
                break;
        }


    }
}
