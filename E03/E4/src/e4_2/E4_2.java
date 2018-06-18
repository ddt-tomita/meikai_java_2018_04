/**
 * 演習番号：演習4-2（P99）
 * 概要：二桁の整数値(10～99)を当てさせる「数当てゲーム」を作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/11
 * 作成日：2018/06/11
 */
package e4_2;
import java.util.Random;
import java.util.Scanner;

// 二桁の整数値(10～99)を当てさせる「数当てゲーム」のクラス
public class E4_2 {
    // 二桁の整数値(10～99)をプレイヤーに当てさせる
    public static void main(String[] args) {
        // ランダムクラスのインスタンス化を行う
        Random random = new Random();
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 乱数の値を調整するための値
        int randomNumberBase = 10;
        // 10～99の乱数を格納する変数
        int randomNumber = random.nextInt(90) + randomNumberBase;
        // もう一度繰り返す場合の変数
        int oneMoreTime = 1;
        // 繰り返しの動作を行うかどうかに使用する変数
        int retry = 0;

        // 以下、繰り返し行う処理
        do {
            // 整数値の入力を促す文字列を画面に表示する
            System.out.print("整数値：");
            // 整数値の入力を画面から受け取り、変数inputValueに入力文字列を格納する
            int inputValue = standardInput.nextInt();

            // 入力された整数値が正かどうか判定する
            if (inputValue > 0) {
                // 画面に入力された値の符号を表示する
                System.out.println("その値は正です");
            // 入力された整数値が負かどうか判定する
            } else if(inputValue < 0) {
                // 画面に入力された値の符号を表示する
                System.out.println("その値は負です");
            // 入力された値が０だったらここを通る
            } else {
                // 画面に入力された値、"０"を表示する
                System.out.println("その値は０です");
            }

            // 再試行するか入力者に問う
            System.out.println("もう一度？ 1…Yes／0…No：");
            // 画面から入力された値を受け取り、変数retryに値を格納する
            retry = standardInput.nextInt();

        // 入力者が"もう一度？"の問いにYesを選択した場合、繰り返し処理を行う。
        } while ( retry == oneMoreTime );
    }
}
