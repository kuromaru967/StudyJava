import java.util.Scanner;

public class Order2 {
    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください。");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("あなたの年齢を入力してください。");
        int age = scanner.nextInt();
        System.out.println
                ("ようこそ" + age + "歳の" + name + "さん");
    }
}
