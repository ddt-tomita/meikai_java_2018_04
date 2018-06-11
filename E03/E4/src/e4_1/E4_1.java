/**
 * 演習番号：演習4-1（P95）
 * 概要：読み込んだ整数値の符号を判定するList3-5のプログラム(P58)を、好きなだけ何度でも繰り返して
 *       入力・表示できるようにしたプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/11
 * 作成日：2018/06/11
 */
package e4_1;
import java.util.Scanner;

// 整数値を読み込み、その符号を繰り返し求めて表示するクラス
public class E4_1 {
    // 整数値を読み込み、その符号を繰り返し求めて表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

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
        } while ( retry == 1 );
    }
}
