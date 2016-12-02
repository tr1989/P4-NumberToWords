package com.cleancode.numtotext;

public class CreateText{

    String[] textArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    final String twenty = "twenty";
    final String ninety = "ninety";
    final int value_ten = 10;
    final int value_twenty = 20;

    public String numberToText(int number){
        if(number <= value_twenty){
            return textArray[number];
        } else {
            String tensDigit;
            if(number/value_ten == 2){
                tensDigit = twenty;
            } else{
                tensDigit = ninety;
            }
            number = number % value_ten;
            return tensDigit + " " + textArray[number];
        }
    }

}