package Ts2Dashboard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı adını al
        System.out.print("Kullanıcı adını giriniz: ");
        String kullaniciAdi = scanner.nextLine();

        String[] dropTurleri = {"Gök sandığı drobu", "Toprak sandığı drobu", "Cp drobu", "Binek drobu", "Boş drop"};

        // Kullanıcı nesnesini oluştur
        User user = new User(kullaniciAdi, dropTurleri.length);

        // Her bir drop türü için kullanıcıdan sayı al
        for (int i = 0; i < dropTurleri.length; i++) {
            Drop drop = new Drop(dropTurleri[i]);
            System.out.print(drop.getName() + " için bir sayı giriniz: ");
            int sayi = scanner.nextInt();
            drop.setNumber(sayi);
            user.setDrop(i, drop);
        }

        // Kullanıcının girdiği bilgileri ekrana yazdır
        System.out.println("Kullanıcı adı: " + user.getUserName());
        for (int i = 0; i < dropTurleri.length; i++) {
            Drop drop = user.getDrop(i);
            System.out.println(drop.getName() + " için girilen sayı: " + drop.getNumber());
        }

        scanner.close();
    }
}