package com.slapstick.cache;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Words {
    private static final Set<String> words = new HashSet<String>();
    private static final String fileName = "src\\main\\resources\\words-data\\5letterwords.txt";
    static {
        readFile();
    }

    private static void readFile() {
        BufferedReader br = null;
        try {
            File file = new File(fileName);
            br = new BufferedReader(new FileReader(file));
            String word = br.readLine();
            while (word != null) {
                words.add(word);
                word = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Could not close Buffered Writer/Reader");
            }
        }
    }

    public static Set<String> getWords() {
        return words;
    }
}
