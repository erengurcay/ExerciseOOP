package Calisanlar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("çalışanlar programına hoşgeldiniz..");

    String islemler = "İşlemler...\n"
            + "1. Yazılımcı İşlemleri\n"
            +"2. Yönetici İşlemleri \n"
            + "Çıkış için q'ya basınız.";
        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("**********************");

        while (true){
            System.out.println("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Göktuğ Eren","Gürçay",2711,"Python,Java,C");
                String yazilimci_islem = "1.Format At\n"
                                        + "2.Bilgileri Göster\n"
                                        +"Çıkış için q'ya basınız";
                System.out.println(yazilimci_islem);
                while (true){
                    System.out.println("İşlemi seçiniz: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("İşletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);

                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();

                    }
                    else {
                        System.out.println("Geçersiz yazılımcı işlemi...");
                    }


                }

            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Göktuğ","Eren",1412,10);
                String yonetici_islem = "Yönetici İşlemleri\n"
                                        +"1.Zam Yap\n"
                                        + "2.Bilgileri Göster\n"
                                        +"Çıkış için q'ya basınız";
                System.out.println(yonetici_islem);
                while (true){
                    System.out.println("İşlem seçiniz : ");
                    String yntc_islem = scanner.nextLine();

                    if (yntc_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor..");
                        break;
                    } else if (yntc_islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktarı = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktarı);


                    } else if (yntc_islem.equals("2")) {
                        yonetici.bilgileriGoster();

                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi...");
                    }


                }


            }
            else {
                System.out.println("Geçersiz işlem...");
            }


        }








    }
}
