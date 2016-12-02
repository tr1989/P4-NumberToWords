package com.cleancode.numtotext;

public class CreateText{

    String[] textArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    String[] tens = {  "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    final String twenty = "twenty";
    final int value_ten = 10;
    final int value_twenty = 20;
    final int value_hundred = 100;

    public String numberToText(int number){
        if(number <= value_twenty){
            return generateTextIfNUmberIsLessThan20(number);
        } else if(number < value_hundred) {
            return generateTextIfNUmberIsLessThan100(number);
        } else {
            return generateTextIfNUmberIsGreaterThan100(number);
        }
    }

    private String generateTextIfNUmberIsLessThan20(int number){
        return textArray[number];
    }

    private String generateTextIfNUmberIsLessThan100(int number){
        return tens[getTensDigit(number)] + (getUniqueDigit(number) != 0 ? " " + textArray[getUniqueDigit(number)] : "");
    }

    private int getTensDigit(int number){
        return number/value_ten;
    }

    private  int getUniqueDigit(int number){
        return number % value_ten;
    }

    private String generateTextIfNUmberIsGreaterThan100(int number){
        return textArray[number/value_hundred] + " " + "hundred" + " " + numberToText(number%value_hundred);
    }
}