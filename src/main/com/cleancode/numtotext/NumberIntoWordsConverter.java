package com.cleancode.numtotext;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverter {

    String[] textArray = {"zero", "one"};

    public String convertNumberToText(int number){
        return textArray[number];
    }
}
