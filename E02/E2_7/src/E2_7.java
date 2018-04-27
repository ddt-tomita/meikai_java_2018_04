/********************************************************************************
 * 演習番号：演習2-7（P44）														*
 * 概要： 以下に示す３機能のプログラムを作成する。								*
 * 概要： ・１桁の正の整数値（１～９の値）をランダムに生成して表示。			*
 * 概要： ・１桁の負の整数値（ー９～ー１の値）をランダムに生成して表示。		*
 * 概要： ・２桁の正の整数値（１０～９９の値）をランダムに生成して表示。		*
 * 作成者：富田 涼子															*
 * 作成日：2018/04/27															*
 ********************************************************************************/
import java.util.Random;
public class E2_7 {
    public static void main(String[] args) {
        Random rand = new Random();

        int LuckyNo1 = rand.nextInt(9);        // １桁の正の整数値の乱数用変数
        int LuckyNo2 = rand.nextInt(9);        // １桁の負の整数値の乱数用変数
        int LuckyNo3 = rand.nextInt(90);       // ２桁の正の整数値の乱数用変数

        // 今日の１桁の正の整数値のラッキーナンバーを画面に表示します。
        // 0～8の乱数＋1をすることにより、1～9の範囲でランダムな値を取得できます。
        System.out.println("今日の１桁の正の整数値のラッキーナンバーは" + (LuckyNo1 + 1) + "です。");
        // 今日の１桁の負の整数値のラッキーナンバーを画面に表示します。
        // 0～8の乱数＋1を反転させることにより、-9～-1の範囲でランダムな値を取得できます。
        System.out.println("今日の１桁の負の整数値のラッキーナンバーは" + (-LuckyNo2 + 1) + "です。");
        // 今日の２桁の正の整数値のラッキーナンバーを画面に表示します。
        // 0～89の乱数+10をすることにより、10～99の範囲でランダムな値を取得できます。
        System.out.println("今日の２桁の正の整数値のラッキーナンバーは" + (10 + LuckyNo3) + "です。");
    }
}
