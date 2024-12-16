public class Order {
    public static void main(String[] args) {
        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println
                ("あなたは来年、" + (n + 1) + "歳になりますね。");
        int r = new java.util.Random().nextInt(90);
        System.out.println("あなたはたぶん、" + r + "歳ですね？");
    }
}
