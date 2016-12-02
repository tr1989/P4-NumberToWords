package com.cleancode.numtotext.digit;

/**
 * Created by rtulya on 12/3/2016.
 */
public class ThreeDigit implements DigitCount {
    LessThanThreeDigit lessThanThreeDigit = new LessThanThreeDigit();

    public String getText(int number){
        return units[DigitCount.getReminder(number, value_hundred)] + " " + hundred +
                (DigitCount.getModulus(number, value_hundred) != value_zero ? " " + lessThanThreeDigit.getText(DigitCount.getModulus(number, value_hundred)) : "");
    }
}
