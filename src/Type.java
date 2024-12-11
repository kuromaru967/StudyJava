public class Type {
    public static void main(String[] args) {
        float f = 3;
        double d = f;
        System.out.println(f);
        System.out.println(d);
        int age = (int) 3.2;
        System.out.println(age);
        double e = 8.5 / 2;
        long l = 5 + 2L;
        System.out.println(e);
        System.out.println(l);
        String msg = "私の年齢は" + 23;
        System.out.println(msg);
        String name = "なかむら";
        String message;
        message = name + "さん、こんにちは";
        System.out.println(message);
        System.out.print("私の名前は");
        System.out.print(name);
        System.out.println("です");
        int a = 5;
        int b = 3;
        int m = Math.max(a,b);
        System.out.println("比較実験：" + a + "と" + b +"とで大きい方は…" + m);
    }
}
