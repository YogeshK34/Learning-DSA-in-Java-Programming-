package com.PracticalExam;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DisplayFilesWithExtension {
    public static void main(String[] args) {
        String directoryPath = "D:\\React\\.idea";
        String fileExtension = ".iml"; // Change this to the desired file extension

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path) && path.toString().endsWith(fileExtension)) {
                    System.out.println(path.getFileName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}