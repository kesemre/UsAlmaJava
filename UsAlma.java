import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int taban, us;
        double total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı Giriniz: ");
        taban = input.nextInt();
        System.out.print("Üssü giriniz: ");
        us = input.nextInt();
        if (taban == 0 && us == 0) {
            System.out.println("0*0 Belirsizdir");
        } else {
            for (int i = 1; i <= us; i++) {
                total *= taban;
            }
            for (int i = -1; i >= us; i--) {
                total /= taban;
            }
            System.out.println("Sonuç: " + total);
        }


    }
}