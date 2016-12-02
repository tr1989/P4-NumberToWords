package com.cleancode.numtotext;

public class CreateText{

    String[] textArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    String[] tens = {  "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    final String twenty = "twenty";
    final int value_ten = 10;
    final int value_twenty = 20;

    public String numberToText(int number){
        if(number <= value_twenty){
            return generateTextIfNUmberIsLessThan20(number);
        } else {
            return generateTextIfNUmberIsGreaterThan20(number);
        }
    }

    private String generateTextIfNUmberIsLessThan20(int number){
        return textArray[number];
    }

    private String generateTextIfNUmberIsGreaterThan20(int number){
        return getTensDigitText(number) + " " + getUniqueDigitText(number);
    }

    private String getTensDigitText(int number){
        return tens[number/value_ten];
    }

    private  String getUniqueDigitText(int number){
        return textArray[number % value_ten];
    }
}