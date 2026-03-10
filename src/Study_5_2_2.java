public class Study_5_2_2 {
    public static void main(String[] args) {
        add(100, 20);
        add(200, 50);
    }

    //複数の値を受け取るaddメソッド
    public static void add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }
    //引数の渡し方
    //何も渡さない場合:メソッド名()
    //値を1つ渡す場合:メソッド名(値)
    //値を複数渡す場合:メソッド名(値,値,…)　値には変数名の指定も可能
}
