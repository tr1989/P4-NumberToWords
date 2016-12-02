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
}
