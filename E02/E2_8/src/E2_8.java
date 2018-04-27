/********************************************************************************
 * 演習番号：演習2-8（P45）														*
 * 概要： キーボードから読み込んだ整数値プラスマイナス５の範囲の				*
 * 		  整数値をランダムに生成して表示するプログラムを作成する。				*
 * 		 （例：100と入力したら95～105の値を表示する）							*
 * 作成者：富田 涼子															*
 * 作成日：2018/04/27															*
 ********************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class E2_8 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        // 整数値の入力を促す文字列を画面に表示する
        System.out.print("整数値：");
        // 整数値の入力を画面から受け取り、変数Numberに入力値を格納する
        int Number = stdIn.nextInt();
        // ０～１０までの１１通りの乱数を生成し、変数RandomNumberに値を格納する
        int RandomNumber = rand.nextInt(11);

        // 画面に今回生成した乱数の説明を表示します。
        System.out.print("その値の±5の乱数を生成しました。");
        // 入力値＋０～１０の乱数＝入力値プラス１０の範囲の乱数を生成できます。
        // 上記からー５することによって、入力値プラスマイナス５の範囲の乱数を生成できます。
        System.out.print("それは" + (Number + RandomNumber -5) + "です。");
    }

}
