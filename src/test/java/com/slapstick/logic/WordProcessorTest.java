package com.slapstick.logic;

public class WordProcessorTest {

    public static void main(String[] args){
        WordProcessorTest testWordProcessor = new WordProcessorTest();
        testWordProcessor.performTest();
    }

    String answer = "stamp";

    public void performTest(){
        String[] guesses = new String[]{"weqav","paths","stalk","stamp"};
        for(String guess : guesses) {
            checkGuess(guess);
        }
    }


    public void checkGuess(String word){
        MatchType[] matchType = new MatchType[5];
        WordProcessor wordProcessor = new WordProcessor(answer);
        matchType = wordProcessor.processWord(word);
        System.out.println("The result for the guess "+ word + " is ");
        for(int i = 0; i < 5; i++){
            System.out.println(matchType[i]);
        }
    }
}
