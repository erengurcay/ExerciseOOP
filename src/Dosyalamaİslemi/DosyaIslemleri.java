package Dosyalamaİslemi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaIslemleri {
    public static void baslangicVerileriniYaz() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veriler.txt"))) {
            writer.write("eren 1000\n");
            writer.write("berker 2000\n");
            // Diğer başlangıç verilerini buraya ekleyebilirsiniz
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}