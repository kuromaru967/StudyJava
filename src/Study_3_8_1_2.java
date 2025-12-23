import java.util.Scanner;

public class Study_3_8_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ①
        int weight = scanner.nextInt();
        System.out.println(weight == 60);

        // ➁
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        System.out.println((age1 + age2) * 2 > 60);

        // ③
        int age = scanner.nextInt();
        System.out.println(age % 2 == 1);

        // ④
        String name = scanner.nextLine();
        System.out.println("湊".equals(name));

        //3-2 A.C.E.F
    }
}
