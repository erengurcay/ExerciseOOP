package IdmanProgramıLogDosyalı;

import IdmanProgramı.Idman;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman programına hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler..\n"
                + "Burpee \n"
                + "Pushup\n"
                + "Situp\n"
                + "Squat\n";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.println("Burpee sayısı :");
        int burpee = scanner.nextInt();
        System.out.println("Pushup sayısı :");
        int pushup = scanner.nextInt();
        System.out.println("Situp sayısı :");
        int situp = scanner.nextInt();
        System.out.println("Squat sayısı :");
        int squat = scanner.nextInt();

        scanner.nextLine();


        IdmanProgramı.Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("Idmanınız başlıyor...");

        int i =1;

        try(FileWriter writer = new FileWriter("log.txt")){
            writer.write("Idman Programı\n");
            writer.write("Burpee Sayısı : " + idman.getBurpee_sayisi() + "\n");
            writer.write("Pushup Sayısı : " + idman.getPushup_sayisi() + "\n");
            writer.write("Situp Sayısı : " + idman.getSitup_sayisi() + "\n");
            writer.write("Squat Sayısı : " + idman.getSquat_sayisi() + "\n");


        while (idman.idmanBittiMi() == false) {
            System.out.println("Hareket Türü (Burpee,Pushup,Situp,Squat) :");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);

            writer.write(i + " . İşlem------------->  Hareket : " + tur  + " Sayı : " + sayi + "\n" );
            i++;

        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Idmanını başarıyla bitirdin..");

    }

}