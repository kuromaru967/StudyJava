public class Study_4_4_1 {
    public static void main(String[] args) {
        int[] score = {20, 30, 40, 50, 80, 90, 100};
        for (int i = 0; i < score.length; i++) {
            //配列をforループで回す
            //for(int i=0;i<配列変数名.length;i++)
            //for文の終了条件に配列変数名.lengthを用いる。
            System.out.println(score[i]);
            //↑scoreが+1ずつ増えて表示される
        }
    }
}
