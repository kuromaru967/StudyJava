public class Study_5_2 {
    public static void main(String[] args) {
        System.out.println("メソッドを呼び出します");
        hello("湊");
        hello("朝香");
        hello("菅原");
        System.out.println("メソッドの呼び出しが終わりました");
    }

    public static void hello(String name) {
        System.out.println(name + "さん、こんにちは");
    }

//    public static void main(String[] args) {
//        add(100, 20);
//        add(200, 50);
//    }
//
//    //複数の値を受け取るaddメソッド
//    public static void add(int x, int y) {
//        int ans = x + y;
//        System.out.println(x + "+" + y + "=" + ans);
//    }
    //引数の渡し方
    //何も渡さない場合:メソッド名()
    //値を1つ渡す場合:メソッド名(値)
    //値を複数渡す場合:メソッド名(値,値,…)　値には変数名の指定も可能
}
