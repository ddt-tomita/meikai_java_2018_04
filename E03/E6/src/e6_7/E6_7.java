/**
 * 演習番号：演習6-7（P195）
 * 概要：List6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである。
 *       最も末尾側に位置する要素を見つけるプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2019/03/27
 * 作成日：2019/03/27
 */
package e6_7;
import java.util.Random;
import java.util.Scanner;

// 線形探索クラス
public class E6_7 {
    public static void main(String[] args) {
        // ランダムクラスのインスタンス化を行う
        Random random = new Random();
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 要素数の定数
        final int ELEMENT_COUNT = 12;
        // 配列の宣言
        int[] arrayInt = new int[ELEMENT_COUNT];
        // 乱数用の定数
        final int MAX_VALUE = 10;

        // 要素数分のループを行う
        for (int countValue = 0; countValue < ELEMENT_COUNT; countValue++) {
        	// 配列に乱数を格納していく
        	arrayInt[countValue] = random.nextInt(MAX_VALUE);
        }

        // 配列arrayIntの全要素の値を画面出力する
		System.out.print("配列arrayIntの全要素の値\n{ ");
        // 要素数分のループを行う
        for (int countValue = 0; countValue < ELEMENT_COUNT; countValue++) {
        	// 値の出力を行う
    		System.out.print(arrayInt[countValue] + " ");
        }
        // 配列の最後のカッコを出力する
		System.out.println("}");

        // 探す数値の入力を促す
        System.out.print("探す数値：");
        // 画面から数値を受け取り、変数keyNumberに値を格納する
        int keyNumber = standardInput.nextInt();

        // ELEMENT_COUNT - 1 のほうがいいかも
        int countValue = 11;
        // 11から0まで見ていくループを作成する
        for(int i = 0; i < 10; i++) {

        }

    }
}
