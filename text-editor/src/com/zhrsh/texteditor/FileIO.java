package com.zhrsh.texteditor;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileIO {
    public static void saveToFile(String content, String fileName) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, content.getBytes());
            Color.printYellowln("file berhasil di save sebagai " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
