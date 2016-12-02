package com.cleancode.numtotext;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverter {

    public String convertNumberToText(int number){
        return (number == 1) ? "one" : "zero";
    }
}
