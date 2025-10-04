package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStrategy implements OutputStrategy {

    private final String filename;

    public FileOutputStrategy(String filename) {
        this.filename = filename;
    }

    public void output(String outputString) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(outputString);
            System.out.println("Primos guardados en: " + filename);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
