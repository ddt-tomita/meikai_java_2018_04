/**
 * 演習番号：演習3-17（P83）
 * 概要：0,1,2のいずれかの値の乱数を生成し、0であれば"グー"、1であれば"チョキ"、2であれば"パー"
 *       を表示するプログラムを作成せよ
 * 作成者：富田 涼子
 * 作成日：2018/06/10
 * 修正日：2018/06/10
 */
package e3_17;

import java.util.Random;
import java.util.Scanner;

//じゃんけんをするクラス
public class E3_17 {
    //じゃんけんをします
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化を行う
        Scanner standardInput = new Scanner(System.in);
        // ランダムクラスのインスタンス化を行う
        Random random = new Random();

        // じゃんけんを申し込む
        System.out.println("じゃんけんをしましょう。");
        // じゃんけんする上で入力者にもなにか選んでもらう
        System.out.print("あなたはなにを出しますか：");
        // じゃんけんの入力を画面から受けとる
        standardInput.next();

        // 0～2の乱数を作成するための変数
        int randomNumberBase = 3;
        // じゃんけんのもととなる0～2の乱数を作成する
        int randomNumber = random.nextInt(randomNumberBase);

        // グーを表す変数
        final int rockNumber = 0;
        // チョキを表す変数
        final int scissorsNumber = 1;
        // パーを表す変数
        final int paperNumber = 2;

        // 読み込んだ乱数の値ごとにじゃんけんの種類を決める
        switch ( randomNumber ){
            // 乱数が0(グー)の場合
            case rockNumber :
                // グーをだす
                System.out.println("グー");
                // switch文から抜ける
                break;
            // 乱数が1(チョキ)の場合
            case scissorsNumber :
                // チョキをだす
                System.out.println("チョキ");
                // switch文から抜ける
                break;
            // 乱数が2(パー)の場合
            case paperNumber :
                // パーを出す
                System.out.println("パー");
                // switch文から抜ける
                break;
        }


    }
}
