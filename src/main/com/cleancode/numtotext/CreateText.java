package com.cleancode.numtotext;

import com.cleancode.numtotext.digit.DigitCount;
import com.cleancode.numtotext.digit.FourDigit;
import com.cleancode.numtotext.digit.LessThanThreeDigit;
import com.cleancode.numtotext.digit.ThreeDigit;

import java.util.HashMap;
import java.util.Map;

public class CreateText{

    public CreateText() {
        this.digitCountMap.put(1, new LessThanThreeDigit());
        this.digitCountMap.put(2, new LessThanThreeDigit());
        this.digitCountMap.put(3, new ThreeDigit());
        this.digitCountMap.put(4, new FourDigit());
    }

    private Map<Integer, DigitCount> digitCountMap = new HashMap<Integer, DigitCount>();

    public String numberToText(int number){

        int length = String.valueOf(number).length();
        DigitCount digitCount =  digitCountMap.get(length);
        return digitCount.getText(number);
    }

}