import java.util.Scanner;

public class Study_4_9 {
    public static void main(String[] args) {
        //①
        int[] points = new int[4];
        double[] weights = new double[5];
        boolean[] answers = new boolean[3];
        String[] names = new String[3];
        //②
        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        for (int value : moneyList) {
            System.out.println(value);
        }
        //③NullPointerException,ArrayIndexOutOfBoundsException
//        int[] counts = null;
//        float[] heights = {171.3F, 175.0F};
//        System.out.println(counts[1]);
//        System.out.println(heights[2]);

        //④
        boolean found = false;
        int[] numbers = {3, 4, 9};
        System.out.println("一桁の数字を入力して下さい");

        int input = new Scanner(System.in).nextInt();
        for (int i : numbers) {
            if (i == input) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("アタリ！");
        } else {
            System.out.println("ハズレ");
        }
    }
}