/**
 * 演習番号：演習3-13（P73）
 * 概要：キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 * 作成者：富田 涼子
 * 作成日：2018/06/10
 * 修正日：2018/06/10
 */
package e3_13;

import java.util.Scanner;

//キーボードから読み込んだ三つの整数値の中央値を求めて表示するクラス
public class E3_13 {
    //キーボードから読み込んだ三つの整数値の中央値を求めて表示する
    public static void main(String[] args) {
        // 標準入力ストリームのインスタンス化をする
        Scanner standardInput = new Scanner(System.in);

        // 整数Aの入力を促す文字列を画面に表示する
        System.out.print("整数A：");
        // 整数Aの入力を画面から受け取り、変数inputValueAに格納する
        int inputValueA = standardInput.nextInt();
        // 整数Bの入力を促す文字列を画面に表示する
        System.out.print("整数B：");
        // 整数Bの入力を画面から受け取り、変数inputValueBに格納する
        int inputValueB = standardInput.nextInt();
        // 整数Cの入力を促す文字列を画面に表示する
        System.out.print("整数C：");
        // 整数Cの入力を画面から受け取り、変数inputValueCに格納する
        int inputValueC = standardInput.nextInt();

        // 三つの整数値の中で最小値を格納するための変数minValueを初期化する
        int minValue = 0;
        // 三つの整数値の中で最大値を格納するための変数maxValueを初期化する
        int maxValue = 0;
        // 三つの整数値の中で中央値を格納するための変数middleValueを初期化する
        int middleValue = 0;

        // 中央値取得のために、最小値の変数名を格納する変数
        String variableNameMin = "";
        // 中央値取得のために、最大値の変数名を格納する変数
        String variableNameMax = "";

        // 中央値取得のために、variableNameMinまたはvariableNameMaxに格納するための変数
        String inputValueA_String ="inputValueA";
        // 中央値取得のために、variableNameMinまたはvariableNameMaxに格納するための変数
        String inputValueB_String ="inputValueB";
        // 中央値取得のために、variableNameMinまたはvariableNameMaxに格納するための変数
        String inputValueC_String ="inputValueC";



        // ★minValueの設定
        // inputValueAをminValueと仮定する
        minValue = inputValueA;
        // 中央値取得のために、minValueに入る値の変数名"inputValueA"をvariableNameMinに格納する
        variableNameMin = inputValueA_String;
        // inputValueBがminValueよりも小さいことを判定する
        if (inputValueB < minValue) {
            // inputValueBがminValueよりも小さければminValueにinputValueBを格納する
            minValue = inputValueB;
            // 中央値取得のために、minValueに入る値の変数名"inputValueB"をvariableNameMinに格納する
            variableNameMin = inputValueB_String;
        }
        // inputValueCがminValueよりも小さいことを判定する
        if (inputValueC < minValue) {
            // inputValueCがminValueよりも小さければminValueにinputValueCを格納する
            minValue = inputValueC;
            // 中央値取得のために、minValueに入る値の変数名"inputValueC"をvariableNameMinに格納する
            variableNameMin = inputValueC_String;
        }

        // ★maxValueの設定
        // inputValueAをmaxValueと仮定する
        maxValue = inputValueA;
        // 中央値取得のために、maxValueに入る値の変数名"inputValueA"をvariableNameMaxに格納する
        variableNameMax = inputValueA_String;
        // inputValueBがmaxValueよりも大きいことを判定する
        if (inputValueB > maxValue) {
            // inputValueBがmaxValueよりも大きければmaxValueにinputValueBを格納する
            maxValue = inputValueB;
            // 中央値取得のために、maxValueに入る値の変数名"inputValueB"をvariableNameMaxに格納する
            variableNameMax = inputValueB_String;
        }
        // inputValueCがmaxValueよりも大きいことを判定する
        if (inputValueC > maxValue) {
            // inputValueCがmaxValueよりも大きければminValueにinputValueCを格納する
            maxValue = inputValueC;
            // 中央値取得のために、maxValueに入る値の変数名"inputValueC"をvariableNameMaxに格納する
            variableNameMax = inputValueC_String;
        }

        // ★middleValueの設定
        // inputValueAが最小値でも最大値でもないことを判定する
        if (inputValueA_String != variableNameMin && inputValueA_String != variableNameMax) {
            // inputValueAはminValueでもmaxValueでもないので中央値となる
            middleValue = inputValueA;
        // inputValueBが最小値でも最大値でもないことを判定する
        }else if (inputValueB_String != variableNameMin && inputValueB_String != variableNameMax) {
            // inputValueBはminValueでもmaxValueでもないので中央値となる
            middleValue = inputValueB;
        // inputValueCが最小値でも最大値でもないことを判定する
        }else if (inputValueC_String != variableNameMin && inputValueC_String != variableNameMax) {
            // inputValueCはminValueでもmaxValueでもないので中央値となる
            middleValue = inputValueC;
        }
        // ※入力された整数値の中に同じ値が入っていたとしても、variableNameMinとvariableNameMaxには先に入れた値の名前が
        //   入っているため、あとから判定した同じ値はこちらのmiddleValueに入ることになる



        // 画面から読み込んだ中央値を出力する
        System.out.println("中央値は" + middleValue + "です。");
    }
}
