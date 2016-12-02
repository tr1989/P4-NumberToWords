package com.cleancode.numtotext.digit;

/**
 * Created by rtulya on 12/3/2016.
 */
public class LessThanThreeDigit implements DigitCount{

    public String getText(int number){
        if(number <= value_twenty){
            return generateTextIfNUmberIsLessThan20(number);
        }else{
            return generateTextIfNUmberIsLessThan100(number);
        }
    }

    private String generateTextIfNUmberIsLessThan20(int number){
        return units[number];
    }

    private String generateTextIfNUmberIsLessThan100(int number){
        return tens[DigitCount.getReminder(number, value_ten)] +
                (DigitCount.getModulus(number, value_ten) != value_zero ? " " + units[DigitCount.getModulus(number, value_ten)] : "");
    }
}
