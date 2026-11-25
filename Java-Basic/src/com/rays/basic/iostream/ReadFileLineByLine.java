package com.rays.basic.iostream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) throws IOException {

        // 1. FileReader object
        FileReader file = new FileReader("C:/test.txt");

        // 2. BufferedReader object
        BufferedReader in = new BufferedReader(file);

        // 3. Read first line
        String line = in.readLine();

        while (line != null) {

            System.out.println(line);

            // Read next line
            line = in.readLine();
        }

        in.close();
    }
}