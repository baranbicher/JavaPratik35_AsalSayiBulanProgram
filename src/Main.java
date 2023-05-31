import java.util.Scanner;

public class Main {
    static int prime(int a) {
        int result = 0;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                result++;
            }
        }
        if(result == 0) {
            System.out.println(a + " sayısı Asal Sayıdır!");
        }
        else {
            System.out.println(a + " sayısı Asal Sayı değildir!");
        }
        return result;
    }

    public static void main(String[] args) {
while (true){
    Scanner input = new Scanner(System.in);
    System.out.print("Sayıyı Giriniz: ");
    int b = input.nextInt();

    prime(b);
}
    }
}