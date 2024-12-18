public class fortunetelling {
    public static void main(String[] args) {
        // ①
        System.out.println("ようこそ占いの館へ");
        // ②
        System.out.println("あなたの名前を入力してください");
        // ③
        String name = new java.util.Scanner(System.in).nextLine();
        // ④
        System.out.println("あなたの年齢を入力してください");
        // ⑤
        String ageString = new java.util.Scanner(System.in).nextLine();
        // ⑥
        int age = Integer.parseInt(ageString);
        // ⑦
        int fortune = new java.util.Random().nextInt(4);
        // ⑧
        fortune++;
        // ⑨
        System.out.println("占いの結果が表示されました！");
        // ⑩
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        // ⑪
        System.out.println("1:大吉" + "2:中吉" + "3:吉" + "4:凶");
    }
}
