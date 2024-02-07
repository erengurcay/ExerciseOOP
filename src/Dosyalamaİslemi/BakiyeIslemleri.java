package Dosyalamaİslemi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BakiyeIslemleri {
    public static void bakiyeGuncelle(String kullaniciAdi, int miktar) {
        Map<String, Integer> bakiyeler = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("veriler.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] adım = line.split(" ");
                String kullanici = adım[0];
                int bakiye = Integer.parseInt(adım[1]);
                bakiyeler.put(kullanici, bakiye);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (bakiyeler.containsKey(kullaniciAdi)) {
            int eskiBakiye = bakiyeler.get(kullaniciAdi);
            bakiyeler.put(kullaniciAdi, eskiBakiye + miktar);
        } else {
            bakiyeler.put(kullaniciAdi, miktar);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veriler.txt"))) {
            for (Map.Entry<String, Integer> entry : bakiyeler.entrySet()) {
                writer.write(entry.getKey() + " " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}