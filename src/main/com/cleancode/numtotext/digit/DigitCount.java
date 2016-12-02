package com.cleancode.numtotext.digit;

/**
 * Created by rtulya on 12/3/2016.
 */
public interface DigitCount {

    String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    String[] tens = {  "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    String twenty = "twenty";
    String hundred = "hundred";
    String thousand = "thousand";
    int value_zero = 0;
    int value_ten = 10;
    int value_twenty = 20;
    int value_hundred = 100;
    int value_thousand = 1000;

    String getText(int number);

    static int getReminder(int number, int divisorForNthPlace){
        return number / divisorForNthPlace;
    }

    static int getModulus (int number, int divisor){
        return number % divisor;
    }

}
