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
}