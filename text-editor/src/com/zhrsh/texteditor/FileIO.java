package com.zhrsh.texteditor;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileIO {
    public static void saveToFile(String content, String fileName) {
        String fileNameTxt = fileName + ".txt";
        Path path = Paths.get(fileNameTxt);
        try {
            Files.write(path, content.getBytes());
            Color.printYellowln("file berhasil di save sebagai " + fileNameTxt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
