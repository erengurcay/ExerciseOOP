package Dosyalamaİslemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsmi girin: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Yapacağınız işlemi seçiniz (paraçekme ya da parayatırma): ");
        String islem = scanner.nextLine();

        System.out.print("Tutar giriniz: ");
        int miktar = scanner.nextInt();

        if (islem.equals("paraçekme")) {
            BakiyeIslemleri.bakiyeGuncelle(kullaniciAdi, -miktar);
        } else if (islem.equals("parayatırma")) {
            BakiyeIslemleri.bakiyeGuncelle(kullaniciAdi, miktar);
        } else {
            System.out.println("Geçersiz işlem!");
        }

        scanner.close();
    }
}
