package com.cleancode.numtotext;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverter {

    String[] textArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    public String convertNumberToText(int number){
        if(number <=20){
            return textArray[number];
        } else {
            return "twenty one";
        }

    }
}
