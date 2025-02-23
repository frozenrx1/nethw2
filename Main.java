import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите цену: ");
        int price = scan.nextInt();
        System.out.print("Введите вес: ");
        int weight = scan.nextInt();

        float res = calcCustoms(price, weight);

        System.out.println("Размер пошлины: " + res);

        scan.close();

    }

    public static float calcCustoms(int price, int weight) {
        float a = 0.01f;
        float res = a * price + weight * 100;
        return res;
    }

}