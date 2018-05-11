/**
 * 演習番号：演習3-3（P59）
 * 概要：List3-5の最後のelseを、else if(n==0)に変更したらどうなるかを検討せよ
 * 作成者：富田 涼子
 * 作成日：2018/05/02
 * 作成日：2018/05/02
 */
package e3_3;
import java.util.Scanner;

//List3-5の最後のelseを、else if(n==0)に変更したらどうなるかを検討するためのクラス
public class E3_3 {
    //List3-5の最後のelseを、else if(n==0)に変更したらどうなるかを検討する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 整数値の入力を促す文字列を画面に表示する
        System.out.print("整数値：");
        // 整数値の入力を画面から受け取り、変数integerValueに入力文字列を格納する
        int integerValue = standardInput.nextInt();

        // 画面から入力された整数値の符号が正か判定をする
        if (integerValue > 0) {
            // 画面に入力された値の符号を出力する
            System.out.println("その値は正です");
        // 画面から入力された整数値の符号が負か判定をする
        } else if(integerValue < 0) {
            // 画面に入力された値の符号を出力する
            System.out.println("その値は負です");
        // 画面から入力された値が０か判定をする
        } else if( integerValue == 0) {
            // 画面に入力された値を出力する
            System.out.println("その値は０です");
        }
    }
}
// List3-5の最後のelseを、else if(n==0)に変更したらどうなるかを検討せよ
// elseの場合もelse ifの場合も、入力された値が０の場合にしか通らないので、同じ結果になると思います。
