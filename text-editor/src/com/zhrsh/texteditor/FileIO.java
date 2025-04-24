/* Copyright (c) 2025 Zahra A. S. */

package com.zhrsh.texteditor;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * Kelas FileIO menyediakan fungsionalitas untuk menyimpan konten ke dalam file.
 */
public class FileIO {
    /**
     * Menyimpan konten ke dalam file dengan nama yang diberikan. File akan disimpan dengan extension .txt.
     *
     * @param content  Konten yang akan disimpan ke dalam file.
     * @param fileName Nama file tanpa extension yang akan digunakan untuk menyimpan konten.
     */
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
