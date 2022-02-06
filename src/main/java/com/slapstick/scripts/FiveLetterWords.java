package com.slapstick.scripts;

import java.io.*;

public class FiveLetterWords {

    public static void main(String[] args){
        BufferedReader br = null;
        BufferedWriter bw = null;

        String fileName = "../resources/words-data/words_alpha.txt";
        try {
            br = new BufferedReader(new FileReader(fileName));

            File fout = new File("5letterwords.txt");
            FileOutputStream fos = new FileOutputStream(fout);

            bw = new BufferedWriter(new OutputStreamWriter(fos));

            String word = br.readLine();
            if(word.length() == 5){
                bw.write(word);
                bw.newLine();
            }
            while (word != null) {
                System.out.println(word);
                word = br.readLine();
                if(word.length() == 5){
                    bw.write(word);
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                System.out.println("Could not close Buffered Writer/Reader");
            }
        }
    }
}
