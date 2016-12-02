package com.cleancode.numtotext.digit;

/**
 * Created by rtulya on 12/3/2016.
 */
public class FourDigit implements DigitCount{
    ThreeDigit threeDigit = new ThreeDigit();
    public String getText(int number){
        return units[DigitCount.getReminder(number, value_thousand)] + " " + thousand +
                (DigitCount.getModulus(number, value_thousand) != value_zero ? " " + threeDigit.getText(DigitCount.getModulus(number, value_thousand)) : "");
    }
}
