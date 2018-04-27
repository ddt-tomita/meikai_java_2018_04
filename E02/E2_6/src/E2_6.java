/********************************************************************************
 * 演習番号：演習2-6（P41）														*
 * 概要： 三角形の底辺と高さを読み込んで、その面積を表示する					*
 * 作成者：富田 涼子															*
 * 作成日：2018/04/27															*
 ********************************************************************************/
import java.util.Scanner;

public class E2_6 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // これから表示する内容の説明を画面出力しています
        System.out.println("三角形の面積を求めます。");

        // 底辺の値の入力を促す
        System.out.println("底辺：");
        // 変数bottomに、画面から入力された底辺の値を格納する
        double bottom = stdIn.nextDouble();

        // 高さの値の入力を促す
        System.out.println("高さ：");
        // 変数heightに、画面から入力された高さの値を格納する
        double height = stdIn.nextDouble();

        // 入力された底辺と高さを元に、三角形の面積を画面に出力する（底辺×高さ÷２）
        System.out.println("面積は" + (bottom * height / 2) + "です。");
    }

}
