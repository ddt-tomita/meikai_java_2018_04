/**
 * 演習番号：演習2-10（P47）
 * 概要：名前の姓と名とを個別にキーボードに読み込んで、挨拶を行うプログラムを作成する。
 * 作成者：富田 涼子
 * 作成日：2018/05/02
 * 作成日：2018/05/02
 */
import java.util.Scanner;

//画面を通じて入力者に挨拶を行うクラス。
public class E2_10 {

    //画面を通じて入力者に挨拶を行う
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);
        // 姓の入力を促す文字列を画面に表示する
        System.out.print("姓：");
        // 姓の入力を画面から受け取り、変数LastNameに入力文字列を格納する
        String lastName = standardInput.nextLine();
        // 名の入力を促す文字列を画面に表示する
        System.out.print("名：");
        // 名の入力を画面から受け取り、変数FirstNameに入力文字列を格納する
        String firstName = standardInput.nextLine();

        //入力者への挨拶を表示する
        System.out.println("こんにちは" + lastName + firstName + "さん。");
    }

}
