package Ts2Dashboard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı adını al
        System.out.print("Kullanıcı adını giriniz: ");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("1 = Gök Sandığı \n"+
                        "2 = Toprak Sandığı \n"+
                            "3 = Cp Sandığı\n"+
                            "4 = Binek\n"+
                            "5 = Boş Drop\n");

        int[] dropTurleri = {1, 2, 3, 4, 5};

        // Kullanıcı nesnesini oluştur
        User user = new User(kullaniciAdi, dropTurleri.length);

        // Her bir drop türü için kullanıcıdan sayı al
        for (int i = 0; i < dropTurleri.length; i++) {
            Drop drop = new Drop(dropTurleri[i]);
            System.out.print(drop.getId() + " için bir sayı giriniz: ");
            int sayi = scanner.nextInt();
            drop.setNumber(sayi);
            user.setDrop(i, drop);
        }

        // Kullanıcının girdiği bilgileri ekrana yazdır
        System.out.println("Kullanıcı adı: " + user.getUserName());
        for (int i = 0; i < dropTurleri.length; i++) {
            Drop drop = user.getDrop(i);
            System.out.println(drop.getId() + " için girilen sayı: " + drop.getNumber());
        }

        scanner.close();
    }
}