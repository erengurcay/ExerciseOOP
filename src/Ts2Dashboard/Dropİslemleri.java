package Ts2Dashboard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dropİslemleri {
    public static void dropGüncelle(String kullaniciAdi , int dropTurleri[]){
        Map<String, Integer> degerler = new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("drpolar.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] adım = line.split(" ");
                String kullanici = adım[0];
                int droplar = Integer.parseInt(adım[1]);
                degerler.put(kullanici, droplar);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(degerler.containsKey(kullaniciAdi)){


        }

    }
}
