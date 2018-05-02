/**
 * 演習番号：演習2-4（P40）
 * 概要：キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力する
 * 作成者：富田 涼子
 * 作成日：2018/04/25
 * 作成日：2018/05/02
 */
import java.util.Scanner;

// キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するクラス
class E2_4 {

    // キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化
        Scanner StandardInput = new Scanner(System.in);

        // 整数値の入力を促す文字列を出力する
        System.out.print("整数値：");
        // 画面から入力された整数値を変数aに入れ初期化する
        int number = StandardInput.nextInt();

        // 入力された値に10を加えた値を画面に表示する
        System.out.println("10を加えた値は" + (number + 10) + "です。");
        // 入力された値に10を減じた値を画面に表示する
        System.out.println("10を減じた値は" + (number - 10) + "です。");
    }
}
