/**
 * 演習番号：演習4-27（P132）
 * 概要：List4-3(P98)の数当てゲームのプレイヤーが入力できる回数に制限を設けたプログラムを作成せよ。
 *       制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること。
 * 作成者：富田 涼子
 * 作成日：2018/10/10
 * 修正日：2018/10/10
 */
package e4_27;

import java.util.Random;
import java.util.Scanner;

// 数当てゲームクラス(0～99を当てさせる)
public class E4_27 {
    // 数当てゲーム(0～99を当てさせる)
    public static void main(String[] args) {
        // ランダムクラスのインスタンス化を行う
        Random random = new Random();
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 乱数の元となる値
        final int RANDOM_NUMBER_BASE = 100;
        // 0～99の乱数を格納する変数
        int randomNumber = random.nextInt(RANDOM_NUMBER_BASE);

        // 数当てゲームの開始表示
        System.out.println("数当てゲーム開始！");
        // 数当てゲームのルール説明
        System.out.println("0～99の数を当ててください。");

        // 回答回数
        int answerCount = 0;
        // 制限回数
        final int LIMIT_VALUE = 3;
        // プレイヤーが入力した数
        int inputValue = 0;

    //
    Outer:
        // 以下、繰り返し行う処理
        do {
        	//
            do {
	            // 値の入力を促す文字列を画面に表示する
	            System.out.print("いくつかな：");
	            // 値の入力を画面から受け取り、変数inputValueに入力文字列を格納する
	            inputValue = standardInput.nextInt();

	            // 入力された値が答えより大きい場合
	            if (inputValue > randomNumber) {
	                // ヒントを表示する
	                System.out.println("もっと小さな数だよ。");
	            // 入力された値が答えより小さい場合
	            } else if(inputValue < randomNumber) {
	                // ヒントを表示する
	                System.out.println("もっと大きな値だよ。");
	            //
	            } else if (inputValue == randomNumber) {
	                //
	                System.out.println("正解です。");
	                //
	            	break Outer;
	            }
				answerCount++;
			} while (answerCount < LIMIT_VALUE);
			//
            System.out.println("正解は"+ randomNumber +"です。");
            //
        	break Outer;
        //
        } while ( inputValue != randomNumber );





//        制限回数ループ｛
//        	正解！
//        	全部処理抜ける
//        ｝
//        // 制限回数内で当てられなかったら
//        答えを表示

    }

}
