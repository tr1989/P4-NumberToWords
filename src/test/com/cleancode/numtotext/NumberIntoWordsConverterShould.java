package com.cleancode.numtotext;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rtulya on 12/2/2016.
 */
public class NumberIntoWordsConverterShould {
    @Test
    public void convert_0_into_words_as_zero() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("zero", n2wConverter.convertNumberToText(0));
    }

    @Test
    public void convert_1_into_words_as_one() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("one", n2wConverter.convertNumberToText(1));
    }

    @Test
    public void convert_20_into_words_as_twenty() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("twenty", n2wConverter.convertNumberToText(20));
    }

    @Test
    public void convert_21_into_words_as_twenty_one() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("twenty one", n2wConverter.convertNumberToText(21));
    }

    @Test
    public void convert_25_into_words_as_twenty_five() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("twenty five", n2wConverter.convertNumberToText(25));
    }

    @Test
    public void convert_95_into_words_as_ninety_five() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("ninety five", n2wConverter.convertNumberToText(95));
    }

    @Test
    public void convert_105_into_words_as_one_hundred_five() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("one hundred five", n2wConverter.convertNumberToText(105));
    }

    @Test
    public void convert_130_into_words_as_one_hundred_thirty() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("one hundred thirty", n2wConverter.convertNumberToText(130));
    }

    @Test
    public void convert_1230_into_words_as_one_thousand_two_hundred_thirty() {
        NumberIntoWordsConverter n2wConverter = new NumberIntoWordsConverter();
        Assert.assertEquals("one thousand two hundred thirty", n2wConverter.convertNumberToText(1230));
    }
}
