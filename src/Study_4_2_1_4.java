public class Study_4_2_1_4 {
    public static void main(String[] args) {
        //配列変数の作成（宣言）
        int[] score;  //要素の型[] 配列変数名
        score = new int[5];

        //上記を同時に行うことも可能
        //int[] score = new int[5];

        //配列の要素数の取得
        int kobakos = score.length;  //配列変数名.iength
        System.out.println("要素の数: " + kobakos);
    }
}
